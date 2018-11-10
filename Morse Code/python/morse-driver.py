from morse import decode, encode

print(encode("hello"))  # .... . .-.. .-.. ---
print(encode("candy"))  # -.-. .- -. -.. -.--
# .-- .... .- -   .. ...   -.-- --- ..- .-.   -. .- -- .
print(encode("what is your name"))

print(decode(".... ..   - .... . .-. . "))  # hi there
# we like codeday
print(decode(".-- .   .-.. .. -.- .   -.-. --- -.. . -.. .- -.-- "))
# thanks for playing
print(decode("- .... .- -. -.- ...   ..-. --- .-.   .--. .-.. .- -.-- .. -. --. "))


# Checks, should all be true
print(encode("hello") == ".... . .-.. .-.. --- ")
print(encode("candy") == "-.-. .- -. -.. -.-- ")
print(encode("what is your name") ==
      ".-- .... .- -   .. ...   -.-- --- ..- .-.   -. .- -- . ")

print(decode(".... ..   - .... . .-. . ") == "hi there")
print(decode(".-- .   .-.. .. -.- .   -.-. --- -.. . -.. .- -.-- ")
      == "we like codeday")
print(decode("- .... .- -. -.- ...   ..-. --- .-.   .--. .-.. .- -.-- .. -. --. ")
      == "thanks for playing")
