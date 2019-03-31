package com.github.j5ik2o.reactive.aws.model

import java.io.File
import java.lang
import java.nio.ByteBuffer
import java.nio.charset.Charset
import java.nio.file.Path
import java.util.Optional

import org.reactivestreams.{ Publisher, Subscriber, Subscription }
import software.amazon.awssdk.core.async.{ AsyncRequestBody => JavaAsyncRequestBody }

import scala.compat.java8.OptionConverters._

object AsyncRequestBody {

  def fromString(string: String, charset: Charset): AsyncRequestBody = {
    new AsyncRequestBody {
      override def toJava: JavaAsyncRequestBody                    = JavaAsyncRequestBody.fromString(string, charset)
      override def contentLength: Option[Long]                     = toJava.contentLength().asScala.map(_.longValue())
      override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = toJava.subscribe(s)
    }
  }

  def fromString(string: String): AsyncRequestBody = {
    new AsyncRequestBody {
      override def toJava: JavaAsyncRequestBody                    = JavaAsyncRequestBody.fromString(string)
      override def contentLength: Option[Long]                     = toJava.contentLength().asScala.map(_.longValue())
      override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = toJava.subscribe(s)
    }
  }

  def fromFile(file: Path): AsyncRequestBody = {
    new AsyncRequestBody {
      override def toJava: JavaAsyncRequestBody                    = JavaAsyncRequestBody.fromFile(file)
      override def contentLength: Option[Long]                     = toJava.contentLength().asScala.map(_.longValue())
      override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = toJava.subscribe(s)
    }
  }

  def fromFile(file: File): AsyncRequestBody = {
    new AsyncRequestBody {
      override def toJava: JavaAsyncRequestBody                    = JavaAsyncRequestBody.fromFile(file)
      override def contentLength: Option[Long]                     = toJava.contentLength().asScala.map(_.longValue())
      override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = toJava.subscribe(s)
    }
  }

  def fromByteBuffer(byteBuffer: ByteBuffer): AsyncRequestBody = {
    new AsyncRequestBody {
      override def toJava: JavaAsyncRequestBody                    = JavaAsyncRequestBody.fromByteBuffer(byteBuffer)
      override def contentLength: Option[Long]                     = toJava.contentLength().asScala.map(_.longValue())
      override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = toJava.subscribe(s)
    }
  }

  def fromBytes(arrayBytes: Array[Byte]): AsyncRequestBody = {
    new AsyncRequestBody {
      override def toJava: JavaAsyncRequestBody                    = JavaAsyncRequestBody.fromBytes(arrayBytes)
      override def contentLength: Option[Long]                     = toJava.contentLength().asScala.map(_.longValue())
      override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = toJava.subscribe(s)
    }
  }

  def fromPublisher(publisher: Publisher[ByteBuffer]): AsyncRequestBody = {
    new AsyncRequestBody {
      override def toJava: JavaAsyncRequestBody                    = JavaAsyncRequestBody.fromPublisher(publisher)
      override def contentLength: Option[Long]                     = toJava.contentLength().asScala.map(_.longValue())
      override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = toJava.subscribe(s)
    }
  }

  def empty: AsyncRequestBody = {
    new AsyncRequestBody {
      override def toJava: JavaAsyncRequestBody                    = JavaAsyncRequestBody.empty()
      override def contentLength: Option[Long]                     = toJava.contentLength().asScala.map(_.longValue())
      override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = toJava.subscribe(s)
    }
  }

  def fromIterable(iterable: Iterable[Array[Byte]]): AsyncRequestBody = {
    new AsyncRequestBody {
      private val itr                          = iterable.iterator
      override def contentLength: Option[Long] = None

      override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = {
        s.onSubscribe(new Subscription {
          override def request(n: Long): Unit = {
            if (n > 0) {
              if (itr.hasNext) {
                s.onNext(ByteBuffer.wrap(itr.next()))
              } else {
                s.onComplete()
              }
            } else s.onError(new IllegalArgumentException("§3.9: non-positive requests are not allowed!"))
          }
          override def cancel(): Unit = {}
        })
      }
    }
  }

}

trait AsyncRequestBody extends Publisher[ByteBuffer] {
  self =>
  def contentLength: Option[Long]

  def toJava: JavaAsyncRequestBody = {
    new JavaAsyncRequestBody {
      override def contentLength(): Optional[lang.Long] = self.contentLength.map(_.asInstanceOf[java.lang.Long]).asJava

      override def subscribe(s: Subscriber[_ >: ByteBuffer]): Unit = self.subscribe(s)
    }
  }
}
