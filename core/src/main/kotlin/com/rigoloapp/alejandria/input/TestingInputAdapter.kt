package com.rigoloapp.alejandria.input

import ktx.app.KtxInputAdapter

class TestingInputAdapter : KtxInputAdapter {
    // Implementation of all ApplicationListener methods is optional. Handle the events you plan on supporting.

    override fun touchDown(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
        // Handle mouse click...
        println("screenX: $screenX, screenY: $screenY")
        return true
    }

    override fun keyDown(keycode: Int): Boolean {
        println("keycode: $keycode")
        return true
    }

    override fun keyUp(keycode: Int): Boolean {
        println("keycode: $keycode")
        return true
    }
}