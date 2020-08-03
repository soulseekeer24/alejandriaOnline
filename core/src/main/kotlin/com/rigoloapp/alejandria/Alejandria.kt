package com.rigoloapp.alejandria

import com.badlogic.gdx.Gdx
import com.rigoloapp.alejandria.input.TestingInputAdapter
import com.rigoloapp.alejandria.screen.AlejandriaScreen
import com.rigoloapp.alejandria.screen.TestingLevelScreen
import ktx.app.KtxGame

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class Alejandria : KtxGame<AlejandriaScreen>() {


    override fun create() {
        Gdx.input.inputProcessor = TestingInputAdapter()

        addScreen(TestingLevelScreen(this))
        setScreen<TestingLevelScreen>()
    }
}