<style>img[alt=drawing]{width: 300px;}</style>
# Week 7 Lab Report

## Part 1
We want to edit the file `DocSearchServer.java` so the parameter `start` in the class `FileHelpers` is changed to `base` in as few keystrokes as possible using vim.
We want to turn this:
![image](start.jpg)

into this:
![image](end.jpg)

I (my group and I didn't get very far in lab) minimized the task to these 22 keystrokes:
`/start<enter>cebase<esc>n.n.:wq<enter>`
We can group these keystrokes into four main sections:

0. First we must open `DocSearchServer.java` with vim. These do not count toward the 22 keystrokes.
`vim DocSearchServer.java`
![image](0.0.jpg)
![image](0.1.jpg)

1. Now let's start with finding the first instance of the parameter `start`. We do this using the `/` command followed by our search parameter `start`.
`/start<enter>`
![image](1.0.jpg)

2. Next we delete the first instance of the parameter `start` using the command `ce`. Then we can replace it with the parameter `base`.
`cebase`
![image](2.0.jpg)
![image](2.1.jpg)

3. This is where the fun begins.
First we'll use the command `<esc>` to exit out of **insert mode**. Now we want to replace the remaining two instances of the parameter `start`. Guess what? We don't need to repeat steps 1 or 2 to replace the other instances! We can cheat a little by using the commands `n` and `.` to find and replace the other two instances.
`<esc>n`
![image](3.0.jpg)
`.`
![image](3.1.jpg)
`n`
![image](3.2.jpg)
`.`
![image](3.3.jpg)

4. And boom! We're done. All that's left is to save the edits and exit Vim.
`:wq<enter>`
