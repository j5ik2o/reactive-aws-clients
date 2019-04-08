package com.github.j5ik2o.reactive.aws.s3.akka

import java.io.File
import java.nio.file.Path

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import software.amazon.awssdk.core.ResponseBytes
import software.amazon.awssdk.core.async.{ AsyncRequestBody, AsyncResponseTransformer }
import software.amazon.awssdk.services.s3.model.{ GetObjectRequest, GetObjectTorrentRequest, _ }

trait S3AkkaClientSupport {
  this: S3AkkaClient =>

  import S3AkkaClient._

  def listBucketsSource: Source[ListBucketsResponse, NotUsed] = Source.fromFuture(
    underlying.listBuckets()
  )

  def getObjectAsBytesSource(
      getObjectRequest: GetObjectRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ResponseBytes[GetObjectResponse], NotUsed] =
    Source.single(getObjectRequest).via(getObjectAsBytesFlow(parallelism))

  def getObjectAsBytesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetObjectRequest, ResponseBytes[GetObjectResponse], NotUsed] =
    Flow[GetObjectRequest].mapAsync(parallelism)(underlying.getObjectAsBytes)

  def getObjectToFileSource(getObjectRequest: GetObjectRequest,
                            file: File,
                            parallelism: Int = DefaultParallelism): Source[GetObjectResponse, NotUsed] =
    Source.single((getObjectRequest, file)).via(getObjectToFileFlow(parallelism))

  def getObjectToFileFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(GetObjectRequest, File), GetObjectResponse, NotUsed] =
    Flow[(GetObjectRequest, File)].mapAsync(parallelism) {
      case (getObjectRequest, file) =>
        underlying.getObjectToFile(getObjectRequest, file)
    }

  def getObjectToPathSource(getObjectRequest: GetObjectRequest,
                            path: Path,
                            parallelism: Int = DefaultParallelism): Source[GetObjectResponse, NotUsed] =
    Source.single((getObjectRequest, path)).via(getObjectToPathFlow(parallelism))

  def getObjectToPathFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(GetObjectRequest, Path), GetObjectResponse, NotUsed] =
    Flow[(GetObjectRequest, Path)].mapAsync(parallelism) {
      case (getObjectRequest, destinationPath) =>
        underlying.getObjectToPath(getObjectRequest, destinationPath)
    }

  def getObjectSource[A](getObjectRequest: GetObjectRequest,
                         asyncResponseTransformer: AsyncResponseTransformer[GetObjectResponse, A],
                         parallelism: Int = DefaultParallelism): Source[A, NotUsed] =
    Source.single((getObjectRequest, asyncResponseTransformer)).via(getObjectFlow(parallelism))

  def getObjectFlow[A](
      parallelism: Int = DefaultParallelism
  ): Flow[(GetObjectRequest, AsyncResponseTransformer[GetObjectResponse, A]), A, NotUsed] =
    Flow[(GetObjectRequest, AsyncResponseTransformer[GetObjectResponse, A])].mapAsync(parallelism) {
      case (getObjectRequest, responseTransformer) =>
        underlying.getObject(getObjectRequest, responseTransformer)
    }

  def getObjectTorrentAsBytesSource(
      getObjectTorrentRequest: GetObjectTorrentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ResponseBytes[GetObjectTorrentResponse], NotUsed] =
    Source.single(getObjectTorrentRequest).via(getObjectTorrentAsBytesFlow(parallelism))

  def getObjectTorrentAsBytesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetObjectTorrentRequest, ResponseBytes[GetObjectTorrentResponse], NotUsed] =
    Flow[GetObjectTorrentRequest].mapAsync(parallelism)(underlying.getObjectTorrentAsBytes)

  def getObjectTorrentToFileSource(getObjectTorrentRequest: GetObjectTorrentRequest,
                                   file: File,
                                   parallelism: Int = DefaultParallelism): Source[GetObjectTorrentResponse, NotUsed] =
    Source.single((getObjectTorrentRequest, file)).via(getObjectTorrentToFileFlow(parallelism))

  def getObjectTorrentToFileFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(GetObjectTorrentRequest, File), GetObjectTorrentResponse, NotUsed] =
    Flow[(GetObjectTorrentRequest, File)].mapAsync(parallelism) {
      case (getObjectRequest, file) =>
        underlying.getObjectTorrentToFile(getObjectRequest, file)
    }

  def getObjectTorrentToPathSource(getObjectTorrentRequest: GetObjectTorrentRequest,
                                   path: Path,
                                   parallelism: Int = DefaultParallelism): Source[GetObjectTorrentResponse, NotUsed] =
    Source.single((getObjectTorrentRequest, path)).via(getObjectTorrentToPathFlow(parallelism))

  def getObjectTorrentToPathFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(GetObjectTorrentRequest, Path), GetObjectTorrentResponse, NotUsed] =
    Flow[(GetObjectTorrentRequest, Path)].mapAsync(parallelism) {
      case (getObjectTorrentRequest, destinationPath) =>
        underlying.getObjectTorrentToPath(getObjectTorrentRequest, destinationPath)
    }

  def getObjectTorrentSource[A](getObjectTorrentRequest: GetObjectTorrentRequest,
                                asyncResponseTransformer: AsyncResponseTransformer[GetObjectTorrentResponse, A],
                                parallelism: Int = DefaultParallelism): Source[A, NotUsed] =
    Source.single((getObjectTorrentRequest, asyncResponseTransformer)).via(getObjectTorrentFlow(parallelism))

  def getObjectTorrentFlow[A](
      parallelism: Int = DefaultParallelism
  ): Flow[(GetObjectTorrentRequest, AsyncResponseTransformer[GetObjectTorrentResponse, A]), A, NotUsed] =
    Flow[(GetObjectTorrentRequest, AsyncResponseTransformer[GetObjectTorrentResponse, A])].mapAsync(parallelism) {
      case (getObjectTorrentRequest, responseTransformer) =>
        underlying.getObjectTorrent(getObjectTorrentRequest, responseTransformer)
    }

  def putObjectSource(putObjectRequest: PutObjectRequest,
                      requestBody: AsyncRequestBody,
                      parallelism: Int = DefaultParallelism): Source[PutObjectResponse, NotUsed] =
    Source.single((putObjectRequest, requestBody)).via(putObjectFlow(parallelism))

  def putObjectFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(PutObjectRequest, AsyncRequestBody), PutObjectResponse, NotUsed] =
    Flow[(PutObjectRequest, AsyncRequestBody)].mapAsync(parallelism) {
      case (putObjectRequest, requestBody) =>
        underlying.putObject(putObjectRequest, requestBody)
    }

  def putObjectFromPathSource(putObjectRequest: PutObjectRequest,
                              path: Path,
                              parallelism: Int = DefaultParallelism): Source[PutObjectResponse, NotUsed] =
    Source.single((putObjectRequest, path)).via(putObjectFromPathFlow(parallelism))

  def putObjectFromPathFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(PutObjectRequest, Path), PutObjectResponse, NotUsed] =
    Flow[(PutObjectRequest, Path)].mapAsync(parallelism) {
      case (putObjectRequest, sourcePath) =>
        underlying.putObjectFromPath(putObjectRequest, sourcePath)
    }

  def putObjectFromFileSource(putObjectRequest: PutObjectRequest,
                              sourceFile: File,
                              parallelism: Int = DefaultParallelism): Source[PutObjectResponse, NotUsed] =
    Source.single((putObjectRequest, sourceFile)).via(putObjectFromFileFlow(parallelism))

  def putObjectFromFileFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(PutObjectRequest, File), PutObjectResponse, NotUsed] =
    Flow[(PutObjectRequest, File)].mapAsync(parallelism) {
      case (putObjectRequest, sourceFile) =>
        underlying.putObjectFromFile(putObjectRequest, sourceFile)
    }

  def uploadPartSource(uploadPartRequest: UploadPartRequest,
                       asyncRequestBody: AsyncRequestBody,
                       parallelism: Int = DefaultParallelism): Source[UploadPartResponse, NotUsed] =
    Source.single((uploadPartRequest, asyncRequestBody)).via(uploadPartFlow(parallelism))

  def uploadPartFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(UploadPartRequest, AsyncRequestBody), UploadPartResponse, NotUsed] =
    Flow[(UploadPartRequest, AsyncRequestBody)].mapAsync(parallelism) {
      case (uploadPartRequest, requestBody) =>
        underlying.uploadPart(uploadPartRequest, requestBody)
    }

  def uploadPartFromPathSource(uploadPartRequest: UploadPartRequest,
                               path: Path,
                               parallelism: Int = DefaultParallelism): Source[UploadPartResponse, NotUsed] =
    Source.single((uploadPartRequest, path)).via(uploadPartFromPathFlow(parallelism))

  def uploadPartFromPathFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(UploadPartRequest, Path), UploadPartResponse, NotUsed] =
    Flow[(UploadPartRequest, Path)].mapAsync(parallelism) {
      case (uploadPartRequest, sourcePath) =>
        underlying.uploadPartFromPath(uploadPartRequest, sourcePath)
    }

  def uploadPartFromFileSource(uploadPartRequest: UploadPartRequest,
                               sourceFile: File,
                               parallelism: Int = DefaultParallelism): Source[UploadPartResponse, NotUsed] =
    Source.single((uploadPartRequest, sourceFile)).via(uploadPartFromFileFlow(parallelism))

  def uploadPartFromFileFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[(UploadPartRequest, File), UploadPartResponse, NotUsed] =
    Flow[(UploadPartRequest, File)].mapAsync(parallelism) {
      case (uploadPartRequest, sourceFile) =>
        underlying.uploadPartFromFile(uploadPartRequest, sourceFile)
    }
}
