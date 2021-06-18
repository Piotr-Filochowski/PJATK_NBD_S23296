import requests #  https://pypi.org/project/requests/

URL = 'http://172.29.64.1:8098/buckets/s23296/keys/'


def print_giewont():
    print("\nGetting Giewont from db:")
    print("----------------")
    r1 = requests.get(URL + "giewont")
    print(r1.text)


# Press the green button in the gutter to run the script.
if __name__ == '__main__':

    print("\nCreatng Giewont")
    print("----------------")
    giewontData = {'name': 'Giewont', 'height': 1895}
    r = requests.post(URL + "giewont", data=giewontData)
    print(r)

    print_giewont()

    print("\nUpdating Giewont")
    print("----------------")
    giewontData = {'name': 'Giewont', 'height': 1895, 'country': 'Poland'}
    r = requests.put(URL + "giewont", data=giewontData)
    print(r)

    print_giewont()

    print("\nDelete Giewont")
    print("----------------")
    r = requests.delete(URL + "giewont")
    print(r)

    print_giewont()
# See PyCharm help at https://www.jetbrains.com/help/pycharm/
