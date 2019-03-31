package com.github.j5ik2o.reactive.aws.s3

import java.nio.file.Path

import com.github.j5ik2o.reactive.aws.model.{ ResponseWithArrayBytes, SdkBytes }
import com.github.j5ik2o.reactive.aws.s3.model._

trait S3ClientSupport[M[_]] { this: S3Client[M] =>

  def getObject(getObjectRequest: GetObjectRequest): M[ResponseWithArrayBytes[GetObjectResponse]]

  def getObject(getObjectRequest: GetObjectRequest, destinationPath: Path): M[GetObjectResponse]

  def getObjectTorrent(
      getObjectTorrentRequest: GetObjectTorrentRequest
  ): M[ResponseWithArrayBytes[GetObjectTorrentResponse]]

  def getObjectTorrent(getObjectTorrentRequest: GetObjectTorrentRequest,
                       destinationPath: Path): M[GetObjectTorrentResponse]

  def putObject(putObjectRequest: PutObjectRequest, requestBody: Iterable[Array[Byte]]): M[PutObjectResponse]

  def putObject(putObjectRequest: PutObjectRequest, sourcePath: Path): M[PutObjectResponse]

  def uploadPart(uploadPartRequest: UploadPartRequest, requestBody: Iterable[Array[Byte]]): M[UploadPartResponse]

  def uploadPart(uploadPartRequest: UploadPartRequest, sourcePath: Path): M[UploadPartResponse]

}
