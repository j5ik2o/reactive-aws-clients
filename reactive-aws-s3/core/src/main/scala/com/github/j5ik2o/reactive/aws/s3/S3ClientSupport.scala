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

import scala.concurrent.Future

trait S3ClientSupport[M[_]] { this: S3Client[M] =>

  def getObjectAsIterable(getObjectRequest: GetObjectRequest): M[ResponseWithIterable[GetObjectResponse]]

  def getObjectAsBytes(getObjectRequest: GetObjectRequest): M[ResponseBytes[GetObjectResponse]]

  def getObjectToFile(getObjectRequest: GetObjectRequest, file: File): M[GetObjectResponse]

  def getObjectToPath(getObjectRequest: GetObjectRequest, destinationPath: Path): M[GetObjectResponse]

  def getObject[A](getObjectRequest: GetObjectRequest,
                   asyncResponseTransformer: AsyncResponseTransformer[GetObjectResponse, A]): M[A]

  def getObjectTorrentAsIterable(
      getObjectRequest: GetObjectTorrentRequest
  ): M[ResponseWithIterable[GetObjectTorrentResponse]]

  def getObjectTorrentAsBytes(
      getObjectRequest: GetObjectTorrentRequest
  ): M[ResponseBytes[GetObjectTorrentResponse]]

  def getObjectTorrentToFile(getObjectRequest: GetObjectTorrentRequest, file: File): M[GetObjectTorrentResponse]

  def getObjectTorrentToPath(getObjectTorrentRequest: GetObjectTorrentRequest,
                             destinationPath: Path): M[GetObjectTorrentResponse]

  def getObjectTorrent[A](
      getObjectTorrentRequest: GetObjectTorrentRequest,
      asyncResponseTransformer: AsyncResponseTransformer[GetObjectTorrentResponse, A]
  ): M[A]

  def putObject(putObjectRequest: PutObjectRequest, requestBody: AsyncRequestBody): M[PutObjectResponse]

  def putObject(putObjectRequest: PutObjectRequest, sourcePath: Path): M[PutObjectResponse]

  def uploadPart(uploadPartRequest: UploadPartRequest, requestBody: AsyncRequestBody): M[UploadPartResponse]

  def uploadPart(uploadPartRequest: UploadPartRequest, sourcePath: Path): M[UploadPartResponse]

}
