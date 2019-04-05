package com.github.j5ik2o.reactive.aws.s3.monix

import java.io.File
import java.nio.file.Path

import com.github.j5ik2o.reactive.aws.s3.S3AsyncClient
import monix.eval.Task
import software.amazon.awssdk.core.ResponseBytes
import software.amazon.awssdk.core.async._
import software.amazon.awssdk.services.s3.model._

private[s3] class S3MonixClientImpl(override val underlying: S3AsyncClient) extends S3MonixClient {
  override type RT[A, B] = AsyncResponseTransformer[A, B]
  override type RB       = AsyncRequestBody

  override def listBuckets(): Task[ListBucketsResponse] = Task.deferFuture {
    underlying.listBuckets()
  }

  override def getObjectAsBytes(getObjectRequest: GetObjectRequest): Task[ResponseBytes[GetObjectResponse]] =
    Task.deferFuture {
      underlying.getObjectAsBytes(getObjectRequest)
    }

  override def getObjectToFile(getObjectRequest: GetObjectRequest, file: File): Task[GetObjectResponse] =
    Task.deferFuture {
      underlying.getObjectToFile(getObjectRequest, file)
    }

  override def getObjectToPath(getObjectRequest: GetObjectRequest, destinationPath: Path): Task[GetObjectResponse] =
    Task.deferFuture {
      underlying.getObjectToPath(getObjectRequest, destinationPath)
    }

  override def getObject[A](getObjectRequest: GetObjectRequest,
                            responseTransformer: AsyncResponseTransformer[GetObjectResponse, A]): Task[A] =
    Task.deferFuture {
      underlying.getObject(getObjectRequest, responseTransformer)
    }

  override def getObjectTorrentAsBytes(
      getObjectRequest: GetObjectTorrentRequest
  ): Task[ResponseBytes[GetObjectTorrentResponse]] = Task.deferFuture {
    underlying.getObjectTorrentAsBytes(getObjectRequest)
  }

  override def getObjectTorrentToFile(getObjectRequest: GetObjectTorrentRequest,
                                      file: File): Task[GetObjectTorrentResponse] = Task.deferFuture {
    underlying.getObjectTorrentToFile(getObjectRequest, file)
  }

  override def getObjectTorrentToPath(getObjectTorrentRequest: GetObjectTorrentRequest,
                                      destinationPath: Path): Task[GetObjectTorrentResponse] = Task.deferFuture {
    underlying.getObjectTorrentToPath(getObjectTorrentRequest, destinationPath)
  }

  override def getObjectTorrent[A](
      getObjectTorrentRequest: GetObjectTorrentRequest,
      responseTransformer: AsyncResponseTransformer[GetObjectTorrentResponse, A]
  ): Task[A] = Task.deferFuture {
    underlying.getObjectTorrent(getObjectTorrentRequest, responseTransformer)
  }

  override def putObject(putObjectRequest: PutObjectRequest, requestBody: AsyncRequestBody): Task[PutObjectResponse] =
    Task.deferFuture {
      underlying.putObject(putObjectRequest, requestBody)
    }

  override def putObjectFromPath(putObjectRequest: PutObjectRequest, sourcePath: Path): Task[PutObjectResponse] =
    Task.deferFuture {
      underlying.putObjectFromPath(putObjectRequest, sourcePath)
    }

  override def putObjectFromFile(putObjectRequest: PutObjectRequest, sourceFile: File): Task[PutObjectResponse] =
    Task.deferFuture {
      underlying.putObjectFromFile(putObjectRequest, sourceFile)
    }

  override def uploadPart(uploadPartRequest: UploadPartRequest,
                          requestBody: AsyncRequestBody): Task[UploadPartResponse] = Task.deferFuture {
    underlying.uploadPart(uploadPartRequest, requestBody)
  }

  override def uploadPartFromPath(uploadPartRequest: UploadPartRequest, sourcePath: Path): Task[UploadPartResponse] =
    Task.deferFuture {
      underlying.uploadPartFromPath(uploadPartRequest, sourcePath)
    }

  override def uploadPartFromFile(uploadPartRequest: UploadPartRequest, sourceFile: File): Task[UploadPartResponse] =
    Task.deferFuture {
      underlying.uploadPartFromFile(uploadPartRequest, sourceFile)
    }

}
