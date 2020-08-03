package com.rigoloapp.alejandria

import com.badlogic.gdx.Game
import com.rigoloapp.alejandria.screen.TestingLevelScreen

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class Alejandria : Game() {
    override fun create() {
        setScreen(TestingLevelScreen(this))
    }
}