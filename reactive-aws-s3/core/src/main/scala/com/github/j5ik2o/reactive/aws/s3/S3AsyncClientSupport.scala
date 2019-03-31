package com.github.j5ik2o.reactive.aws.s3

import java.io.File
import java.nio.ByteBuffer
import java.nio.file.Path

import com.github.j5ik2o.reactive.aws.s3.model.ops._
import com.github.j5ik2o.reactive.aws.model._
import com.github.j5ik2o.reactive.aws.s3.model._
import org.reactivestreams.Publisher

import scala.concurrent.Future
import software.amazon.awssdk.services.s3.model.{
  GetObjectResponse => JavaGetObjectResponse,
  GetObjectTorrentResponse => JavaGetObjectTorrentResponse
}

trait S3AsyncClientSupport extends S3ClientSupport[Future] {
  this: S3AsyncClient =>
  import S3AsyncClient._

  override def getObjectAsIterable(
      getObjectRequest: GetObjectRequest
  ): Future[ResponseWithIterable[GetObjectResponse]] = {
    getObject(getObjectRequest, AsyncResponseTransformers.toIterableArrayBytes[GetObjectResponse])
  }

  override def getObjectAsBytes(getObjectRequest: GetObjectRequest): Future[ResponseBytes[GetObjectResponse]] = {
    getObject(getObjectRequest, AsyncResponseTransformers.toBytes[GetObjectResponse])
  }

  override def getObjectToFile(getObjectRequest: GetObjectRequest, file: File): Future[GetObjectResponse] = {
    getObject(getObjectRequest, AsyncResponseTransformers.toFile[GetObjectResponse](file))
  }

  override def getObjectToPath(getObjectRequest: GetObjectRequest, destinationPath: Path): Future[GetObjectResponse] = {
    import GetObjectRequestOps._
    import GetObjectResponseOps._
    underlying
      .getObject(getObjectRequest.toJava, destinationPath).toFuture.map(_.toScala)
  }

  override def getObject[A](getObjectRequest: GetObjectRequest,
                            asyncResponseTransformer: AsyncResponseTransformer[GetObjectResponse, A]): Future[A] = {
    import GetObjectRequestOps._
    import GetObjectResponseOps._
    underlying
      .getObject(
        getObjectRequest.toJava,
        new AsyncResponseTransformer[JavaGetObjectResponse, A] {
          override def prepare(): Future[A] = asyncResponseTransformer.prepare()
          override def onResponse(response: JavaGetObjectResponse): Unit = {
            asyncResponseTransformer.onResponse(response.toScala)
          }
          override def onStream(publisher: Publisher[ByteBuffer]): Unit = asyncResponseTransformer.onStream(publisher)
          override def exceptionOccurred(error: Throwable): Unit        = asyncResponseTransformer.exceptionOccurred(error)
        }.toJava
      ).toFuture
  }

  override def getObjectTorrentAsIterable(
      getObjectRequest: GetObjectTorrentRequest
  ): Future[ResponseWithIterable[GetObjectTorrentResponse]] = {
    getObjectTorrent(getObjectRequest, AsyncResponseTransformers.toIterableArrayBytes[GetObjectTorrentResponse])
  }

  override def getObjectTorrentAsBytes(
      getObjectRequest: GetObjectTorrentRequest
  ): Future[ResponseBytes[GetObjectTorrentResponse]] = {
    getObjectTorrent(getObjectRequest, AsyncResponseTransformers.toBytes[GetObjectTorrentResponse])
  }

  override def getObjectTorrentToFile(getObjectRequest: GetObjectTorrentRequest,
                                      file: File): Future[GetObjectTorrentResponse] = {
    getObjectTorrent(getObjectRequest, AsyncResponseTransformers.toFile[GetObjectTorrentResponse](file))
  }

  override def getObjectTorrent[A](
      getObjectTorrentRequest: GetObjectTorrentRequest,
      asyncResponseTransformer: AsyncResponseTransformer[GetObjectTorrentResponse, A]
  ): Future[A] = {
    import GetObjectTorrentRequestOps._
    import GetObjectTorrentResponseOps._
    underlying
      .getObjectTorrent(
        getObjectTorrentRequest.toJava,
        new AsyncResponseTransformer[JavaGetObjectTorrentResponse, A] {
          override def prepare(): Future[A] = asyncResponseTransformer.prepare()
          override def onResponse(response: JavaGetObjectTorrentResponse): Unit = {
            asyncResponseTransformer.onResponse(response.toScala)
          }
          override def onStream(publisher: Publisher[ByteBuffer]): Unit = asyncResponseTransformer.onStream(publisher)
          override def exceptionOccurred(error: Throwable): Unit        = asyncResponseTransformer.exceptionOccurred(error)
        }.toJava
      ).toFuture
  }

  override def getObjectTorrentToPath(getObjectTorrentRequest: GetObjectTorrentRequest,
                                      destinationPath: Path): Future[GetObjectTorrentResponse] = {
    import GetObjectTorrentRequestOps._
    import GetObjectTorrentResponseOps._
    underlying
      .getObjectTorrent(getObjectTorrentRequest.toJava, destinationPath).toFuture.map(_.toScala)
  }

  override def putObject(putObjectRequest: PutObjectRequest,
                         requestBody: AsyncRequestBody): Future[PutObjectResponse] = {
    import PutObjectRequestOps._
    import PutObjectResponseOps._
    underlying
      .putObject(
        putObjectRequest.toJava,
        requestBody.toJava
      ).toFuture.map(_.toScala)
  }

  override def putObject(putObjectRequest: PutObjectRequest, sourcePath: Path): Future[PutObjectResponse] = {
    import PutObjectRequestOps._
    import PutObjectResponseOps._
    underlying.putObject(putObjectRequest.toJava, sourcePath).toFuture.map(_.toScala)
  }

  override def uploadPart(uploadPartRequest: UploadPartRequest,
                          requestBody: AsyncRequestBody): Future[UploadPartResponse] = {
    import UploadPartRequestOps._
    import UploadPartResponseOps._
    underlying
      .uploadPart(
        uploadPartRequest.toJava,
        requestBody.toJava
      ).toFuture.map(_.toScala)
  }

  override def uploadPart(uploadPartRequest: UploadPartRequest, sourcePath: Path): Future[UploadPartResponse] = {
    import UploadPartRequestOps._
    import UploadPartResponseOps._
    underlying.uploadPart(uploadPartRequest.toJava, sourcePath).toFuture.map(_.toScala)
  }

}
