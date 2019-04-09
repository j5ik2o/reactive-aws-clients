package com.github.j5ik2o.reactive.aws.s3.cats

import java.io.File
import java.nio.file.Path

import cats.effect.IO
import software.amazon.awssdk.core.ResponseBytes
import software.amazon.awssdk.core.async.{ AsyncRequestBody, AsyncResponseTransformer }
import software.amazon.awssdk.services.s3.model._

trait S3CatsIOClientSupoprt { this: S3CatsIOClient =>
  override type RT[A, B] = AsyncResponseTransformer[A, B]
  override type RB       = AsyncRequestBody

  override def listBuckets(): IO[ListBucketsResponse] =
    IO.fromFuture {
      IO(underlying.listBuckets())
    }

  override def getObjectAsBytes(
      getObjectRequest: GetObjectRequest
  ): IO[ResponseBytes[GetObjectResponse]] = IO.fromFuture {
    IO(underlying.getObjectAsBytes(getObjectRequest))
  }

  override def getObjectToFile(getObjectRequest: GetObjectRequest, file: File): IO[GetObjectResponse] = IO.fromFuture {
    IO(underlying.getObjectToFile(getObjectRequest, file))
  }

  override def getObjectToPath(getObjectRequest: GetObjectRequest, destinationPath: Path): IO[GetObjectResponse] =
    IO.fromFuture {
      IO(underlying.getObjectToPath(getObjectRequest, destinationPath))
    }

  override def getObject[A](
      getObjectRequest: GetObjectRequest,
      responseTransformer: AsyncResponseTransformer[GetObjectResponse, A]
  ): IO[A] =
    IO.fromFuture {
      IO(underlying.getObject(getObjectRequest, responseTransformer))
    }

  override def getObjectTorrentAsBytes(
      getObjectRequest: GetObjectTorrentRequest
  ): IO[ResponseBytes[GetObjectTorrentResponse]] = IO.fromFuture {
    IO(underlying.getObjectTorrentAsBytes(getObjectRequest))
  }

  override def getObjectTorrentToFile(
      getObjectRequest: GetObjectTorrentRequest,
      file: File
  ): IO[GetObjectTorrentResponse] = IO.fromFuture {
    IO(underlying.getObjectTorrentToFile(getObjectRequest, file))
  }

  override def getObjectTorrentToPath(
      getObjectTorrentRequest: GetObjectTorrentRequest,
      destinationPath: Path
  ): IO[GetObjectTorrentResponse] = IO.fromFuture {
    IO(underlying.getObjectTorrentToPath(getObjectTorrentRequest, destinationPath))
  }

  override def getObjectTorrent[A](
      getObjectTorrentRequest: GetObjectTorrentRequest,
      responseTransformer: AsyncResponseTransformer[GetObjectTorrentResponse, A]
  ): IO[A] =
    IO.fromFuture {
      IO(underlying.getObjectTorrent(getObjectTorrentRequest, responseTransformer))
    }

  override def putObject(putObjectRequest: PutObjectRequest, requestBody: AsyncRequestBody): IO[PutObjectResponse] =
    IO.fromFuture {
      IO(underlying.putObject(putObjectRequest, requestBody))
    }

  override def putObjectFromPath(putObjectRequest: PutObjectRequest, sourcePath: Path): IO[PutObjectResponse] =
    IO.fromFuture {
      IO(underlying.putObjectFromPath(putObjectRequest, sourcePath))
    }

  override def putObjectFromFile(putObjectRequest: PutObjectRequest, sourceFile: File): IO[PutObjectResponse] =
    IO.fromFuture {
      IO(underlying.putObjectFromFile(putObjectRequest, sourceFile))
    }

  override def uploadPart(uploadPartRequest: UploadPartRequest, requestBody: AsyncRequestBody): IO[UploadPartResponse] =
    IO.fromFuture {
      IO(underlying.uploadPart(uploadPartRequest, requestBody))
    }

  override def uploadPartFromPath(uploadPartRequest: UploadPartRequest, sourcePath: Path): IO[UploadPartResponse] =
    IO.fromFuture {
      IO(underlying.uploadPartFromPath(uploadPartRequest, sourcePath))
    }

  override def uploadPartFromFile(uploadPartRequest: UploadPartRequest, sourceFile: File): IO[UploadPartResponse] =
    IO.fromFuture {
      IO(underlying.uploadPartFromFile(uploadPartRequest, sourceFile))
    }
}
