import numpy as np # read the array of the image
from matplotlib import pyplot as plt # use to show the image
import cv2 # read the image

img_original = cv2.imread("kitten.jpeg", 0)
plt.imshow(img_original)

pixel_original = np.array([img_original])

plt.hist(pixel_original.ravel(), 256, [0, 256])
plt.show() # ravel function is to flatten the array from 2 dimensional top multi-dimensional

img1 = img_original
# RdYlGn
plt.imshow(img1, cmap="inferno") # https://matplotlib.org/stable/tutorials/colors/colormaps.html

def show(img):
    plt.imshow(img, cmap="gray")
    plt.xticks([]) # referring to the x-axis of the array
    plt.yticks([]) # referring to the y-axis of the array

h, w = img_original.shape
img = np.zeros((h + 160, w), np.uint8) # show the image as if it is uint8 bit
img[80: -80,:] = img_original # dimension
plt.figure(figsize=(15, 5))
plt.subplot(131)
show(img)

pixel_gray = np.array([img])
pixel_gray

plt.hist(img.ravel(), 256, [0, 256]) # ravel function is to flatten the array from 2 dimensional top multi-dimensional
plt.show()

pip install sewar # sewar image quality metrics

from sewar import full_ref # full_ref referred as full reference metrics calculates the mse, rmse, sim
from skimage import measure, metrics
from PIL import Image
from google.colab.patches import cv2_imshow

mean_kernel = np.ones((3, 3), np.float32) / 25

conv_mean = cv2.filter2D(img, -1, mean_kernel, borderType = cv2.BORDER_CONSTANT)
plt.figure(figsize=(5, 5))
show(conv_mean)

rmse_skimg = metrics.normalized_root_mse(img, conv_mean)
print("RMSE: based on scikit-image = ", rmse_skimg)

mse_skimg = metrics.mean_squared_error(img, conv_mean)
print("MSE: based on scikit-image = ", mse_skimg)

psnr_skimg = metrics.peak_signal_noise_ratio(img, conv_mean, data_range=None)
print("PSNR: based on scikit-image = ", psnr_skimg)

from skimage.metrics import structural_similarity as ssim
ssim_skimg = ssim(img, conv_mean, data_range=img.max()-img.min(), multichannel=True)
print("SSIM based on scikit-image = ", ssim_skimg)

def show_results(img):
    conv_mean = cv2.filter2D(img, -1, mean_kernel, borderType = cv2.BORDER_CONSTANT)
    rmse_skimg = metrics.normalized_root_mse(img, conv_mean)
    mse_skimg = metrics.mean_squared_error(img, conv_mean)
    psnr_skimg = metrics.peak_signal_noise_ratio(img, conv_mean, data_range=None)
    ssim_skimg = ssim(img, conv_mean, data_range=img.max()-img.min(), multichannel=True)


img_dog = cv2.imread("dog.jpg", 0)             # blurry
img_kitten1 = cv2.imread("kitten1.jpeg", 0)    # clear
img_kitten2 = cv2.imread("kitten2.jpg", 0)     # clear
img_light1 = cv2.imread("light1.jpg", 0)       # bad lighting
img_people = cv2.imread("people.jpg", 0)       # blurry