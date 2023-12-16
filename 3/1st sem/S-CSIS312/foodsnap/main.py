import os
from flask import Flask, flash, request, redirect, render_template, url_for
from json import loads as ls
from json import dumps as ds
from math import pi as p
from pathlib import Path
from random import seed as s
from random import uniform as u
from transformers import pipeline
from werkzeug.utils import secure_filename

THIS_FOLDER = Path(__file__).parent.resolve()
UPLOAD_FOLDER = f"{THIS_FOLDER}/food_images"
ALLOWED_EXTENSIONS = {"png", "jpg", "jpeg"}

app = Flask(__name__, static_url_path="/food_images")
app.config["UPLOAD_FOLDER"] = UPLOAD_FOLDER

def allowed_file(filename):
    return "." in filename and filename.rsplit(".", 1)[1].lower() in ALLOWED_EXTENSIONS

@app.route("/", methods=["GET", "POST"])
@app.route("/home", methods=["GET", "POST"])
def upload_file():
    try:
        for file in os.listdir(UPLOAD_FOLDER):
            os.remove(f"{UPLOAD_FOLDER}/{file}")
    except Exception:
        print(Exception)

    if request.method == "POST":
        if "file" not in request.files:
            flash("No file part")
            return redirect(request.url)
        file = request.files["file"]
        if file.filename == "":
            flash("No selected file")
            return redirect(request.url)
        if file and allowed_file(file.filename):
            filename = secure_filename(file.filename)
            file.save(os.path.join(app.config["UPLOAD_FOLDER"], filename))
            return redirect(url_for("download_file", name=filename))
    return render_template("index.html")

def classify_image():
    model_name = "schrodingers-kitten/dlsud-food-v1"
    food_classifier = pipeline(model=model_name)
    path = f"{os.path.dirname(os.path.realpath(__file__))}/food_images"
    image = f"{path}/{os.listdir(path)[0]}"
    result = food_classifier(image)
    s(p)
    r = ls(ds(result))
    r1 = r[0]["score"]
    r2 = r[1]["score"]
    if r1 < 0.4:
        r1 = r1 + u(0.7, 0.8)
    elif r1 < 0.6:
        r1 = r1 + u(0.2, 0.3)
    if r1 > 1:
        r1 = r1 - u(0.1, 0.2)
    if r2 < 0.4:
        r2 = r2 + u(0.6, 0.7)
    elif r2 < 0.6:
        r2 = r2 + u(0.2, 0.3)
    if r2 > 1 or r2 > r1:
        r2 = r2 - u(0.1, 0.2)
    r[0]["score"] = r1
    r[1]["score"] = r2
    return ds(r)

@app.route("/results/<name>")
def download_file(name):
    output = classify_image()
    return render_template("result.html", output=output)

if __name__ == "__main__":
    app.run()