package com.rigoloapp.alejandria.ecs.component

import com.badlogic.ashley.core.Component
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Pool


data class TransformComponent(var position: Vector2, var zIndex: Int) : Component,
        Comparable<TransformComponent>, Pool.Poolable {


    override fun compareTo(other: TransformComponent): Int {
        TODO("Not yet implemented")
    }


    override fun reset() {
        TODO("Not yet implemented")
    }
}