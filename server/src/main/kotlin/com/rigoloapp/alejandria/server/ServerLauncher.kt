package com.rigoloapp.alejandria.server

import java.io.IOException
import java.net.InetSocketAddress
import java.nio.ByteBuffer
import java.nio.channels.SelectionKey
import java.nio.channels.Selector
import java.nio.channels.ServerSocketChannel
import java.nio.charset.StandardCharsets


fun main() {
//    val server = Server()
//    Thread(server).start()
}

//class Server(val port: Int = 2624) : Runnable {
//    val socketChannel: ServerSocketChannel = ServerSocketChannel.open()
//    val selector: Selector
//
//
//    init {
//        socketChannel.socket().bind(InetSocketAddress(port))
//        socketChannel.configureBlocking(false)
//        selector = Selector.open()
//
//        socketChannel.register(selector, SelectionKey.OP_ACCEPT)
//
//    }
//
//
//    override fun run() {
//        try {
//
//            while (socketChannel.isOpen && !Thread.interrupted()) {
//                selector.select(1000)
//
//                val iter = selector.selectedKeys().iterator()
//                iter.forEach { key ->
//
//                    if (key.isAcceptable) {
//                        accept(key)
//                    }
//
//                    iter.remove()
//                }
//            }
//
//            println("Shutting down server")
//            socketChannel.close()
//        } catch (e: IOException) {
//            System.err.println("Closing down socker - ${e.printStackTrace()}")
//        }
//    }
//
//
////    fun accept(selectionKey: SelectionKey) {
////        val serverSocket = selectionKey.channel() as ServerSocketChannel
////
////        val clientSocket = serverSocket.accept()
////        clientSocket.configureBlocking(false)
////
////        val address = clientSocket.socket().inetAddress.toString()
////        val port = clientSocket.socket().port
////        val clientId = "$address:$port"
////
////        clientSocket.write(ByteBuffer.wrap("Hello client".toByteArray(StandardCharsets.UTF_8````)))
////    }
//}