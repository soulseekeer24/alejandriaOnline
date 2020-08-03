package com.rigoloapp.alejandria

import com.rigoloapp.alejandria.screen.AlejandriaScreen
import com.rigoloapp.alejandria.screen.TestingLevelScreen
import ktx.app.KtxGame

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class Alejandria : KtxGame<AlejandriaScreen>() {
    override fun create() {
        addScreen(TestingLevelScreen(this))
        setScreen<TestingLevelScreen>()
    }
}