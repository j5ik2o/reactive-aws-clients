package com.github.j5ik2o.reactive.aws.s3

import java.lang
import java.nio.ByteBuffer
import java.nio.file.Path
import java.util.Optional

import com.github.j5ik2o.reactive.aws.s3.model.ops._
import com.github.j5ik2o.reactive.aws.model.{ AsyncResponseTransformers, ResponseWithArrayBytes }
import com.github.j5ik2o.reactive.aws.s3.model._
import org.reactivestreams.{ Subscriber, Subscription }
import software.amazon.awssdk.core.async.AsyncRequestBody
import software.amazon.awssdk.services.s3.model.{
  GetObjectResponse => JavaGetObjectResponse,
  GetObjectTorrentResponse => JavaGetObjectTorrentResponse
}

import scala.concurrent.Future

trait S3AsyncClientImplSupport extends com.github.j5ik2o.reactive.aws.s3.S3ClientSupport[Future] {
  this: S3AsyncClient =>
  import S3AsyncClient._

  override def getObject(getObjectRequest: GetObjectRequest): Future[ResponseWithArrayBytes[GetObjectResponse]] = {
    import GetObjectRequestOps._
    import GetObjectResponseOps._
    underlying
      .getObject(
        getObjectRequest.toJava,
        AsyncResponseTransformers.toArrayBytes[JavaGetObjectResponse]
      ).toFuture.map { v =>
        ResponseWithArrayBytes(v.response.toScala, v.data)
      }
  }

  override def getObject(getObjectRequest: GetObjectRequest, destinationPath: Path): Future[GetObjectResponse] = {
    import GetObjectRequestOps._
    import GetObjectResponseOps._
    underlying.getObject(getObjectRequest.toJava, destinationPath).toFuture.map(_.toScala)
  }

  override def getObjectTorrent(
      getObjectTorrentRequest: GetObjectTorrentRequest
  ): Future[ResponseWithArrayBytes[GetObjectTorrentResponse]] = {
    import GetObjectTorrentRequestOps._
    import GetObjectTorrentResponseOps._
    underlying
      .getObjectTorrent(getObjectTorrentRequest.toJava,
                        AsyncResponseTransformers.toArrayBytes[JavaGetObjectTorrentResponse]).toFuture.map { v =>
        ResponseWithArrayBytes(v.response.toScala, v.data)

      }
  }

  override def getObjectTorrent(getObjectTorrentRequest: GetObjectTorrentRequest,
                                destinationPath: Path): Future[GetObjectTorrentResponse] = {
    import GetObjectTorrentRequestOps._
    import GetObjectTorrentResponseOps._
    underlying
      .getObjectTorrent(getObjectTorrentRequest.toJava, destinationPath).toFuture.map(_.toScala)
  }

  override def putObject(putObjectRequest: PutObjectRequest,
                         requestBody: Iterable[Array[Byte]]): Future[PutObjectResponse] = {
    import PutObjectRequestOps._
    import PutObjectResponseOps._
    underlying
      .putObject(
        putObjectRequest.toJava,
        new AsyncRequestBody {
          private val itr = requestBody.iterator

          override def contentLength(): Optional[lang.Long] = Optional.empty()

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
      ).toFuture.map(_.toScala)
  }

  override def putObject(putObjectRequest: PutObjectRequest, sourcePath: Path): Future[PutObjectResponse] = {
    import PutObjectRequestOps._
    import PutObjectResponseOps._
    underlying.putObject(putObjectRequest.toJava, sourcePath).toFuture.map(_.toScala)
  }

  override def uploadPart(uploadPartRequest: UploadPartRequest,
                          requestBody: Iterable[Array[Byte]]): Future[UploadPartResponse] = {
    import UploadPartRequestOps._
    import UploadPartResponseOps._
    underlying
      .uploadPart(
        uploadPartRequest.toJava,
        new AsyncRequestBody {
          private val itr = requestBody.iterator

          override def contentLength(): Optional[lang.Long] = Optional.empty()

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
      ).toFuture.map(_.toScala)
  }

  override def uploadPart(uploadPartRequest: UploadPartRequest, sourcePath: Path): Future[UploadPartResponse] = {
    import UploadPartRequestOps._
    import UploadPartResponseOps._
    underlying.uploadPart(uploadPartRequest.toJava, sourcePath).toFuture.map(_.toScala)
  }

}
