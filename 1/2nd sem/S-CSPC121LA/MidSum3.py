signs_of_the_zodiac = {
    "Aries": {"Ram": "March 21 - April 19"},
    "Taurus": {"Bull": "April 20 - May 20"},
    "Gemini": {"Twins": "May 21 - June 21"},
    "Cancer": {"Crab": "June 22 - July 22"},
    "Leo": {"Lion": "July 23 - August 22"},
    "Virgo": {"Virgin": "August 23 - September 22"},
    "Libra": {"Balance": "September 23 - October 23"},
    "Scorpius": {"Scorpion": "October 24 - November 21"},
    "Sagittarius": {"Archer": "November 22 - December 21"},
    "Capricornus": {"Goat": "December 22 - January 19"},
    "Aquarius": {"Water Bearer": "January 20 - February 18"},
    "Pisces": {"Fish": "February 19 - March 20"}
}

zodiac = input("Enter your Zodiac: ").title()

if zodiac in signs_of_the_zodiac:
    for sign, birth_date in signs_of_the_zodiac[zodiac].items():
        print(f"Signs of your Zodiac: {sign}")
        print(f"Your birth months is from ({birth_date})")
else:
    print("Invalid input")
