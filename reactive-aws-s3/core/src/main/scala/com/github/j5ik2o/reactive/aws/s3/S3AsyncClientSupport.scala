package com.github.j5ik2o.reactive.aws.s3

import java.io.File
import java.nio.file.Path

import software.amazon.awssdk.core.ResponseBytes
import software.amazon.awssdk.core.async.{ AsyncRequestBody, AsyncResponseTransformer }
import software.amazon.awssdk.services.s3.model._

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

trait S3AsyncClientSupport extends S3ClientSupport[Future] {
  this: S3AsyncClient =>

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
      ).toScala
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
      ).toScala
  }

  override def getObjectTorrentToPath(getObjectTorrentRequest: GetObjectTorrentRequest,
                                      destinationPath: Path): Future[GetObjectTorrentResponse] = {
    underlying
      .getObjectTorrent(getObjectTorrentRequest, destinationPath).toScala
  }

  override def putObject(putObjectRequest: PutObjectRequest,
                         requestBody: AsyncRequestBody): Future[PutObjectResponse] = {
    underlying
      .putObject(
        putObjectRequest,
        requestBody
      ).toScala
  }

  override def putObjectFromPath(putObjectRequest: PutObjectRequest, sourcePath: Path): Future[PutObjectResponse] = {
    underlying.putObject(putObjectRequest, sourcePath).toScala
  }

  override def putObjectFromFile(putObjectRequest: PutObjectRequest, sourceFile: File): Future[PutObjectResponse] = {
    underlying.putObject(putObjectRequest, sourceFile.toPath).toScala
  }

  override def uploadPart(uploadPartRequest: UploadPartRequest,
                          requestBody: AsyncRequestBody): Future[UploadPartResponse] = {
    underlying
      .uploadPart(
        uploadPartRequest,
        requestBody
      ).toScala
  }

  override def uploadPartFromPath(uploadPartRequest: UploadPartRequest,
                                  sourcePath: Path): Future[UploadPartResponse] = {
    underlying.uploadPart(uploadPartRequest, sourcePath).toScala
  }

  override def uploadPartFromFile(uploadPartRequest: UploadPartRequest,
                                  sourceFile: File): Future[UploadPartResponse] = {
    underlying.uploadPart(uploadPartRequest, sourceFile.toPath).toScala
  }

}
