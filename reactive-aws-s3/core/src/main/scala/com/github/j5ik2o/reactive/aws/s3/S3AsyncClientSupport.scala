package com.github.j5ik2o.reactive.aws.s3

import java.io.File
import java.nio.ByteBuffer
import java.nio.file.Path
import java.util.concurrent.CompletableFuture

import com.github.j5ik2o.reactive.aws.s3.model._
import com.github.j5ik2o.reactive.aws.s3.model.ops._
import software.amazon.awssdk.core.ResponseBytes
import software.amazon.awssdk.core.async.{ AsyncRequestBody, AsyncResponseTransformer, SdkPublisher }
import software.amazon.awssdk.services.s3.model.{
  GetObjectResponse => JavaGetObjectResponse,
  GetObjectTorrentResponse => JavaGetObjectTorrentResponse
}

import scala.concurrent.Future

trait S3AsyncClientSupport extends S3ClientSupport[Future] {
  this: S3AsyncClient =>
  import S3AsyncClient._

  override type RT[A, B] = AsyncResponseTransformer[A, B]
  override type RB       = AsyncRequestBody

  override def getObjectAsBytes(getObjectRequest: GetObjectRequest): Future[ResponseBytes[GetObjectResponse]] = {
    getObject(getObjectRequest, AsyncResponseTransformer.toBytes[GetObjectResponse])
  }

  override def getObjectToFile(getObjectRequest: GetObjectRequest, file: File): Future[GetObjectResponse] = {
    getObject(getObjectRequest, AsyncResponseTransformer.toFile[GetObjectResponse](file))
  }

  override def getObjectToPath(getObjectRequest: GetObjectRequest, destinationPath: Path): Future[GetObjectResponse] = {
    getObject(getObjectRequest, AsyncResponseTransformer.toFile[GetObjectResponse](destinationPath))
  }
  override def getObject[A](getObjectRequest: GetObjectRequest,
                            asyncResponseTransformer: AsyncResponseTransformer[GetObjectResponse, A]): Future[A] = {
    import GetObjectRequestOps._
    import GetObjectResponseOps._
    underlying
      .getObject(
        getObjectRequest.toJava,
        new AsyncResponseTransformer[JavaGetObjectResponse, A] {
          override def prepare(): CompletableFuture[A] = asyncResponseTransformer.prepare()
          override def onResponse(response: JavaGetObjectResponse): Unit = {
            asyncResponseTransformer.onResponse(response.toScala)
          }
          override def onStream(publisher: SdkPublisher[ByteBuffer]): Unit =
            asyncResponseTransformer.onStream(publisher)
          override def exceptionOccurred(error: Throwable): Unit = asyncResponseTransformer.exceptionOccurred(error)
        }
      ).toFuture
  }

  override def getObjectTorrentAsBytes(
      getObjectRequest: GetObjectTorrentRequest
  ): Future[ResponseBytes[GetObjectTorrentResponse]] = {
    getObjectTorrent(getObjectRequest, AsyncResponseTransformer.toBytes[GetObjectTorrentResponse])
  }

  override def getObjectTorrentToFile(getObjectRequest: GetObjectTorrentRequest,
                                      file: File): Future[GetObjectTorrentResponse] = {
    getObjectTorrent(getObjectRequest, AsyncResponseTransformer.toFile[GetObjectTorrentResponse](file))
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
          override def prepare(): CompletableFuture[A] = asyncResponseTransformer.prepare()
          override def onResponse(response: JavaGetObjectTorrentResponse): Unit = {
            asyncResponseTransformer.onResponse(response.toScala)
          }
          override def onStream(publisher: SdkPublisher[ByteBuffer]): Unit =
            asyncResponseTransformer.onStream(publisher)
          override def exceptionOccurred(error: Throwable): Unit = asyncResponseTransformer.exceptionOccurred(error)
        }
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
        requestBody
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
        requestBody
      ).toFuture.map(_.toScala)
  }

  override def uploadPart(uploadPartRequest: UploadPartRequest, sourcePath: Path): Future[UploadPartResponse] = {
    import UploadPartRequestOps._
    import UploadPartResponseOps._
    underlying.uploadPart(uploadPartRequest.toJava, sourcePath).toFuture.map(_.toScala)
  }

}
