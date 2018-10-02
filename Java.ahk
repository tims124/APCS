#NoEnv  ; Recommended for performance and compatibility with future AutoHotkey releases.
; #Warn  ; Enable warnings to assist with detecting common errors.
SendMode Input  ; Recommended for new scripts due to its superior speed and reliability.
SetWorkingDir %A_ScriptDir%  ; Ensures a consistent starting directory.

^j:: send set path=;C:\Program Files\Java\jdk1.8.0_181\bin {Enter}
^+j::  send cd C:\Users\Timo\Desktop\APCS {Enter}
^+c:: send cls {Enter}
