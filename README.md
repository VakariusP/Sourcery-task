# Sourcery-task
To compress the string the first character is used to look for identical ones until another character appears.
To identify the amount of identical characters a counter is used that is reset for every unique character.
The counter starts at 1 since there is always at least 1 of the characters.
The loop skips the identical values by changing the loop variable by the amount of times a character was repeated. 
The decompression process is simple since first goes the character that is compressed.
In the next position is the amount of times the char value should be repeated to receive the full string.
So in the cycle the initial character is added a specific number of times to the string to receive the decompressed string.
That is why the for loop interval goes by 2 since it would skip to the next pair of data.
