# Sourcery-task
For the completion of the task to compress and decompress the files two separate methods are used that return compressed and decompressed values respectively.
Before calling these methods, the input data is checked if the string is empty the methods are not called, and an empty value is added to the compressed and decompressed value arrays.

In the method used for compression the first character of the string is immediately added to the compressed string builder.
After this the number of times this character is repeated is found by using a for loop that compares the initial character with characters that go after it in string.
If these characters are identical the counter is increased. 
After the loop finishes the number of times the counter was increased that number of times are skipped in the outside for loop to avoid duplicate values.
This is repeated until the entire string is compressed.
Then the values are stored in an array meant for compressed strings.

This compressed string is then decompressed to receive the initial string.
This is done by getting the character of the string value and by converting the following number that is in string format into int value. 
Then adding the character a number of times the int values specify.
From the method the string is stored in another array meant for decompressed values

