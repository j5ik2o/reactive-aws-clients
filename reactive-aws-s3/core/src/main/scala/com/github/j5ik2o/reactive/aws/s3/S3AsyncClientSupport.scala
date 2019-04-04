package com.github.j5ik2o.reactive.aws.s3

import java.io.File
import java.nio.file.Path

import software.amazon.awssdk.core.ResponseBytes
import software.amazon.awssdk.core.async.{ AsyncRequestBody, AsyncResponseTransformer }
import software.amazon.awssdk.services.s3.model._

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
    underlying
      .getObject(
        getObjectRequest,
        asyncResponseTransformer
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
    underlying
      .getObjectTorrent(
        getObjectTorrentRequest,
        asyncResponseTransformer
      ).toFuture
  }

  override def getObjectTorrentToPath(getObjectTorrentRequest: GetObjectTorrentRequest,
                                      destinationPath: Path): Future[GetObjectTorrentResponse] = {
    underlying
      .getObjectTorrent(getObjectTorrentRequest, destinationPath).toFuture
  }

  override def putObject(putObjectRequest: PutObjectRequest,
                         requestBody: AsyncRequestBody): Future[PutObjectResponse] = {
    underlying
      .putObject(
        putObjectRequest,
        requestBody
      ).toFuture
  }

  override def putObject(putObjectRequest: PutObjectRequest, sourcePath: Path): Future[PutObjectResponse] = {
    underlying.putObject(putObjectRequest, sourcePath).toFuture
  }

  override def uploadPart(uploadPartRequest: UploadPartRequest,
                          requestBody: AsyncRequestBody): Future[UploadPartResponse] = {
    underlying
      .uploadPart(
        uploadPartRequest,
        requestBody
      ).toFuture
  }

  override def uploadPart(uploadPartRequest: UploadPartRequest, sourcePath: Path): Future[UploadPartResponse] = {
    underlying.uploadPart(uploadPartRequest, sourcePath).toFuture
  }

}
