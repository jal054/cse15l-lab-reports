<style>img[alt=drawing]{width: 200px;}</style>

# Week 7 Lab Report

## Part 1

We want to edit the file `DocSearchServer.java` so the parameter `start` in the class `FileHelpers` is changed to `base` in as few keystrokes as possible using vim.

We want to turn this:
![image](start.jpg)

into this:
![image](base.jpg)

I (my group and I didn't get very far in lab) minimized the task to these 22 keystrokes:

`/start<enter>cebase<esc>n.n.:wq<enter>`

We can group these keystrokes into five main sections:

1. `vim DocSearchServer.java`

    First we open `DocSearchServer.java` with vim (which does not count toward the 22 keystrokes).

    ![image](0.0.jpeg)

    ![image](0.1.jpg)

2. `/start<enter>`

    Now let's find the first instance of the parameter `start`.

    We'll do this using the search command `/` followed by our search parameter `start` then `<enter>`.
    ![image](1.0.jpg)

3. `cebase`

    Next we delete the first instance of the parameter `start` using the command `ce` which will take us into **insert mode**.
    ![image](2.0.jpg)

    Then we can replace it with the parameter `base`.
    ![image](2.1.jpg)

4. `<esc>n.n.`

    This is where the fun begins.
    
    We want to replace the remaining two instances of the parameter `start`. First we'll use the command `<esc>` to take us into **normal mode**.

    We don't need to repeat steps 1 or 2 to replace the other instances! Instead, we'll use the commands `n` and `.` to find and replace the other two instances of the parameter `start`.
    
    `n`
    ![image](3.0.jpg)
    `.`
    ![image](3.1.jpg)
    `n`
    ![image](3.2.jpg)
    `.`
    ![image](3.3.jpg)

5. `:wq<enter>`

    And boom! We're done. Finally we save the edits and exit Vim.

## Part 2