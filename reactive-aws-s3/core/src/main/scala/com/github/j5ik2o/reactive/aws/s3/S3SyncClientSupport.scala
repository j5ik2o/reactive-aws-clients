package com.github.j5ik2o.reactive.aws.s3
import java.io.File
import java.nio.file.Path

import com.github.j5ik2o.reactive.aws.model.{
  AsyncRequestBody,
  AsyncResponseTransformer,
  ResponseBytes,
  ResponseWithIterable
}
import com.github.j5ik2o.reactive.aws.s3.model._

trait S3SyncClientSupport extends S3ClientSupport[Either[Throwable, ?]] {
  this: S3SyncClient =>

  override def getObjectAsIterable(
      getObjectRequest: GetObjectRequest
  ): Either[Throwable, ResponseWithIterable[GetObjectResponse]] = ???

  override def getObjectAsBytes(
      getObjectRequest: GetObjectRequest
  ): Either[Throwable, ResponseBytes[GetObjectResponse]] = ???

  override def getObjectToFile(getObjectRequest: GetObjectRequest, file: File): Either[Throwable, GetObjectResponse] =
    ???

  override def getObjectToPath(getObjectRequest: GetObjectRequest,
                               destinationPath: Path): Either[Throwable, GetObjectResponse] = ???

  override def getObject[A](
      getObjectRequest: GetObjectRequest,
      asyncResponseTransformer: AsyncResponseTransformer[GetObjectResponse, A]
  ): Either[Throwable, A] = ???

  override def getObjectTorrentAsIterable(
      getObjectRequest: GetObjectTorrentRequest
  ): Either[Throwable, ResponseWithIterable[GetObjectTorrentResponse]] = ???

  override def getObjectTorrentAsBytes(
      getObjectRequest: GetObjectTorrentRequest
  ): Either[Throwable, ResponseBytes[GetObjectTorrentResponse]] = ???

  override def getObjectTorrentToFile(getObjectRequest: GetObjectTorrentRequest,
                                      file: File): Either[Throwable, GetObjectTorrentResponse] = ???

  override def getObjectTorrentToPath(getObjectTorrentRequest: GetObjectTorrentRequest,
                                      destinationPath: Path): Either[Throwable, GetObjectTorrentResponse] = ???

  override def getObjectTorrent[A](
      getObjectTorrentRequest: GetObjectTorrentRequest,
      asyncResponseTransformer: AsyncResponseTransformer[GetObjectTorrentResponse, A]
  ): Either[Throwable, A] = ???

  override def putObject(putObjectRequest: PutObjectRequest,
                         requestBody: AsyncRequestBody): Either[Throwable, PutObjectResponse] = ???

  override def putObject(putObjectRequest: PutObjectRequest, sourcePath: Path): Either[Throwable, PutObjectResponse] =
    ???

  override def uploadPart(uploadPartRequest: UploadPartRequest,
                          requestBody: AsyncRequestBody): Either[Throwable, UploadPartResponse] = ???

  override def uploadPart(uploadPartRequest: UploadPartRequest,
                          sourcePath: Path): Either[Throwable, UploadPartResponse] = ???
}
