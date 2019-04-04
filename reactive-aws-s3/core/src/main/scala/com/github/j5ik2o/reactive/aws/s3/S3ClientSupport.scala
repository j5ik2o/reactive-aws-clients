package com.github.j5ik2o.reactive.aws.s3

import java.io.File
import java.nio.file.Path

import software.amazon.awssdk.core.ResponseBytes
import software.amazon.awssdk.services.s3.model._

trait S3ClientSupport[M[_]] { this: S3Client[M] =>

  type RT[A, B]
  type RB

  def getObjectAsBytes(getObjectRequest: GetObjectRequest): M[ResponseBytes[GetObjectResponse]]

  def getObjectToFile(getObjectRequest: GetObjectRequest, file: File): M[GetObjectResponse]

  def getObjectToPath(getObjectRequest: GetObjectRequest, destinationPath: Path): M[GetObjectResponse]

  def getObject[A](getObjectRequest: GetObjectRequest, responseTransformer: RT[GetObjectResponse, A]): M[A]

  def getObjectTorrentAsBytes(
      getObjectRequest: GetObjectTorrentRequest
  ): M[ResponseBytes[GetObjectTorrentResponse]]

  def getObjectTorrentToFile(getObjectRequest: GetObjectTorrentRequest, file: File): M[GetObjectTorrentResponse]

  def getObjectTorrentToPath(getObjectTorrentRequest: GetObjectTorrentRequest,
                             destinationPath: Path): M[GetObjectTorrentResponse]
  def getObjectTorrent[A](
      getObjectTorrentRequest: GetObjectTorrentRequest,
      responseTransformer: RT[GetObjectTorrentResponse, A]
  ): M[A]

  def putObject(putObjectRequest: PutObjectRequest, requestBody: RB): M[PutObjectResponse]

  def putObjectFromPath(putObjectRequest: PutObjectRequest, sourcePath: Path): M[PutObjectResponse]

  def putObjectFromFile(putObjectRequest: PutObjectRequest, sourceFile: File): M[PutObjectResponse]

  def uploadPart(uploadPartRequest: UploadPartRequest, requestBody: RB): M[UploadPartResponse]

  def uploadPartFromPath(uploadPartRequest: UploadPartRequest, sourcePath: Path): M[UploadPartResponse]

  def uploadPartFromFile(uploadPartRequest: UploadPartRequest, sourceFile: File): M[UploadPartResponse]

}
