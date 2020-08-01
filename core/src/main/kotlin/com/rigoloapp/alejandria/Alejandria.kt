package com.rigoloapp.alejandria

import com.badlogic.gdx.Game

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class Alejandria : Game() {
    override fun create() {
        setScreen(FirstScreen())
    }
}