package com.rigoloapp.alejandria.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.rigoloapp.alejandria.Alejandria

/** Launches the desktop (LWJGL3) application.  */

fun main() {
    Lwjgl3Application(Alejandria(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("Alejandria")
        setWindowedMode(640, 480)
        setWindowIcon("libgdx128.png", "libgdx64.png", "libgdx32.png", "libgdx16.png")
    })
}

