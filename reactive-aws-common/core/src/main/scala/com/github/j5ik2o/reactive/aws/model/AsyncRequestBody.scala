package com.github.j5ik2o.reactive.aws.model

import java.nio.ByteBuffer

import org.reactivestreams.{ Publisher, Subscriber }

object AsyncRequestBody {

  def fromPublisher(publisher: Publisher[ByteBuffer]): AsyncRequestBody = new AsyncRequestBody {
    override def contentLength: Option[Long]                     = None
    override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = publisher.subscribe(s)
  }

}

trait AsyncRequestBody extends Publisher[ByteBuffer] {
  def contentLength: Option[Long]
}
