package com.github.j5ik2o.reactive.aws.s3

import java.io.File
import java.nio.file.Path

import com.github.j5ik2o.reactive.aws.s3.model.ops._
import software.amazon.awssdk.core.ResponseBytes
import software.amazon.awssdk.core.sync.{ RequestBody, ResponseTransformer }
import software.amazon.awssdk.http.AbortableInputStream
import software.amazon.awssdk.services.s3.model._

trait S3SyncClientSupport extends S3ClientSupport[Either[Throwable, ?]] {
  this: S3SyncClient =>
  import S3SyncClient._

  override type RT[A, B] = ResponseTransformer[A, B]
  override type RB       = RequestBody

  override def getObjectAsBytes(
      getObjectRequest: GetObjectRequest
  ): Either[Throwable, ResponseBytes[GetObjectResponse]] = {
    getObject(getObjectRequest, ResponseTransformer.toBytes())
  }

  override def getObjectToFile(getObjectRequest: GetObjectRequest, file: File): Either[Throwable, GetObjectResponse] = {
    getObject(getObjectRequest, ResponseTransformer.toFile(file))
  }

  override def getObjectToPath(
      getObjectRequest: GetObjectRequest,
      destinationPath: Path
  ): Either[Throwable, GetObjectResponse] = {
    getObject(getObjectRequest, ResponseTransformer.toFile(destinationPath))
  }

  override def getObject[A](
      getObjectRequest: GetObjectRequest,
      responseTransformer: ResponseTransformer[GetObjectResponse, A]
  ): Either[Throwable, A] = {
    underlying
      .getObject(
        getObjectRequest,
        responseTransformer
      ).toEither

  }

  override def getObjectTorrentAsBytes(
      getObjectTorrentRequest: GetObjectTorrentRequest
  ): Either[Throwable, ResponseBytes[GetObjectTorrentResponse]] =
    getObjectTorrent(getObjectTorrentRequest, ResponseTransformer.toBytes())

  override def getObjectTorrentToFile(
      getObjectRequest: GetObjectTorrentRequest,
      file: File
  ): Either[Throwable, GetObjectTorrentResponse] =
    getObjectTorrent(getObjectRequest, ResponseTransformer.toFile(file))

  override def getObjectTorrentToPath(
      getObjectTorrentRequest: GetObjectTorrentRequest,
      destinationPath: Path
  ): Either[Throwable, GetObjectTorrentResponse] =
    getObjectTorrent(getObjectTorrentRequest, ResponseTransformer.toFile(destinationPath))

  override def getObjectTorrent[A](
      getObjectTorrentRequest: GetObjectTorrentRequest,
      responseTransformer: ResponseTransformer[GetObjectTorrentResponse, A]
  ): Either[Throwable, A] = {
    underlying
      .getObjectTorrent(
        getObjectTorrentRequest,
        responseTransformer
      ).toEither

  }

  override def putObject(
      putObjectRequest: PutObjectRequest,
      requestBody: RequestBody
  ): Either[Throwable, PutObjectResponse] = {
    underlying.putObject(putObjectRequest, requestBody).toEither
  }

  override def putObjectFromPath(
      putObjectRequest: PutObjectRequest,
      sourcePath: Path
  ): Either[Throwable, PutObjectResponse] = {
    putObject(putObjectRequest, RequestBody.fromFile(sourcePath))
  }

  override def putObjectFromFile(
      putObjectRequest: PutObjectRequest,
      sourceFile: File
  ): Either[Throwable, PutObjectResponse] = {
    putObject(putObjectRequest, RequestBody.fromFile(sourceFile))
  }

  override def uploadPart(
      uploadPartRequest: UploadPartRequest,
      requestBody: RequestBody
  ): Either[Throwable, UploadPartResponse] = {
    underlying.uploadPart(uploadPartRequest, requestBody).toEither
  }

  override def uploadPartFromPath(
      uploadPartRequest: UploadPartRequest,
      sourcePath: Path
  ): Either[Throwable, UploadPartResponse] = {
    uploadPart(uploadPartRequest, RequestBody.fromFile(sourcePath))
  }

  override def uploadPartFromFile(
      uploadPartRequest: UploadPartRequest,
      sourceFile: File
  ): Either[Throwable, UploadPartResponse] = {
    uploadPart(uploadPartRequest, RequestBody.fromFile(sourceFile))
  }

}
