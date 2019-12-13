// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.rekognition.{ RekognitionAsyncClient, RekognitionClient }
import software.amazon.awssdk.services.rekognition.model._
import software.amazon.awssdk.services.rekognition.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object RekognitionCatsIOClient {

  def apply(asyncClient: RekognitionAsyncClient)(implicit ec: ExecutionContext): RekognitionCatsIOClient =
    new RekognitionCatsIOClient {
      override val executionContext: ExecutionContext = ec
      override val underlying: RekognitionAsyncClient = asyncClient
    }

}

trait RekognitionCatsIOClient extends RekognitionClient[IO] {

  val underlying: RekognitionAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def compareFaces(compareFacesRequest: CompareFacesRequest): IO[CompareFacesResponse] =
    IO.fromFuture {
      IO(underlying.compareFaces(compareFacesRequest))
    }

  override def createCollection(createCollectionRequest: CreateCollectionRequest): IO[CreateCollectionResponse] =
    IO.fromFuture {
      IO(underlying.createCollection(createCollectionRequest))
    }

  override def createProject(createProjectRequest: CreateProjectRequest): IO[CreateProjectResponse] =
    IO.fromFuture {
      IO(underlying.createProject(createProjectRequest))
    }

  override def createProjectVersion(
      createProjectVersionRequest: CreateProjectVersionRequest
  ): IO[CreateProjectVersionResponse] =
    IO.fromFuture {
      IO(underlying.createProjectVersion(createProjectVersionRequest))
    }

  override def createStreamProcessor(
      createStreamProcessorRequest: CreateStreamProcessorRequest
  ): IO[CreateStreamProcessorResponse] =
    IO.fromFuture {
      IO(underlying.createStreamProcessor(createStreamProcessorRequest))
    }

  override def deleteCollection(deleteCollectionRequest: DeleteCollectionRequest): IO[DeleteCollectionResponse] =
    IO.fromFuture {
      IO(underlying.deleteCollection(deleteCollectionRequest))
    }

  override def deleteFaces(deleteFacesRequest: DeleteFacesRequest): IO[DeleteFacesResponse] =
    IO.fromFuture {
      IO(underlying.deleteFaces(deleteFacesRequest))
    }

  override def deleteStreamProcessor(
      deleteStreamProcessorRequest: DeleteStreamProcessorRequest
  ): IO[DeleteStreamProcessorResponse] =
    IO.fromFuture {
      IO(underlying.deleteStreamProcessor(deleteStreamProcessorRequest))
    }

  override def describeCollection(
      describeCollectionRequest: DescribeCollectionRequest
  ): IO[DescribeCollectionResponse] =
    IO.fromFuture {
      IO(underlying.describeCollection(describeCollectionRequest))
    }

  override def describeProjectVersions(
      describeProjectVersionsRequest: DescribeProjectVersionsRequest
  ): IO[DescribeProjectVersionsResponse] =
    IO.fromFuture {
      IO(underlying.describeProjectVersions(describeProjectVersionsRequest))
    }

  def describeProjectVersionsPaginator(
      describeProjectVersionsRequest: DescribeProjectVersionsRequest
  ): DescribeProjectVersionsPublisher =
    underlying.describeProjectVersionsPaginator(describeProjectVersionsRequest)

  override def describeProjects(describeProjectsRequest: DescribeProjectsRequest): IO[DescribeProjectsResponse] =
    IO.fromFuture {
      IO(underlying.describeProjects(describeProjectsRequest))
    }

  def describeProjectsPaginator(describeProjectsRequest: DescribeProjectsRequest): DescribeProjectsPublisher =
    underlying.describeProjectsPaginator(describeProjectsRequest)

  override def describeStreamProcessor(
      describeStreamProcessorRequest: DescribeStreamProcessorRequest
  ): IO[DescribeStreamProcessorResponse] =
    IO.fromFuture {
      IO(underlying.describeStreamProcessor(describeStreamProcessorRequest))
    }

  override def detectCustomLabels(
      detectCustomLabelsRequest: DetectCustomLabelsRequest
  ): IO[DetectCustomLabelsResponse] =
    IO.fromFuture {
      IO(underlying.detectCustomLabels(detectCustomLabelsRequest))
    }

  override def detectFaces(detectFacesRequest: DetectFacesRequest): IO[DetectFacesResponse] =
    IO.fromFuture {
      IO(underlying.detectFaces(detectFacesRequest))
    }

  override def detectLabels(detectLabelsRequest: DetectLabelsRequest): IO[DetectLabelsResponse] =
    IO.fromFuture {
      IO(underlying.detectLabels(detectLabelsRequest))
    }

  override def detectModerationLabels(
      detectModerationLabelsRequest: DetectModerationLabelsRequest
  ): IO[DetectModerationLabelsResponse] =
    IO.fromFuture {
      IO(underlying.detectModerationLabels(detectModerationLabelsRequest))
    }

  override def detectText(detectTextRequest: DetectTextRequest): IO[DetectTextResponse] =
    IO.fromFuture {
      IO(underlying.detectText(detectTextRequest))
    }

  override def getCelebrityInfo(getCelebrityInfoRequest: GetCelebrityInfoRequest): IO[GetCelebrityInfoResponse] =
    IO.fromFuture {
      IO(underlying.getCelebrityInfo(getCelebrityInfoRequest))
    }

  override def getCelebrityRecognition(
      getCelebrityRecognitionRequest: GetCelebrityRecognitionRequest
  ): IO[GetCelebrityRecognitionResponse] =
    IO.fromFuture {
      IO(underlying.getCelebrityRecognition(getCelebrityRecognitionRequest))
    }

  def getCelebrityRecognitionPaginator(
      getCelebrityRecognitionRequest: GetCelebrityRecognitionRequest
  ): GetCelebrityRecognitionPublisher =
    underlying.getCelebrityRecognitionPaginator(getCelebrityRecognitionRequest)

  override def getContentModeration(
      getContentModerationRequest: GetContentModerationRequest
  ): IO[GetContentModerationResponse] =
    IO.fromFuture {
      IO(underlying.getContentModeration(getContentModerationRequest))
    }

  def getContentModerationPaginator(
      getContentModerationRequest: GetContentModerationRequest
  ): GetContentModerationPublisher =
    underlying.getContentModerationPaginator(getContentModerationRequest)

  override def getFaceDetection(getFaceDetectionRequest: GetFaceDetectionRequest): IO[GetFaceDetectionResponse] =
    IO.fromFuture {
      IO(underlying.getFaceDetection(getFaceDetectionRequest))
    }

  def getFaceDetectionPaginator(getFaceDetectionRequest: GetFaceDetectionRequest): GetFaceDetectionPublisher =
    underlying.getFaceDetectionPaginator(getFaceDetectionRequest)

  override def getFaceSearch(getFaceSearchRequest: GetFaceSearchRequest): IO[GetFaceSearchResponse] =
    IO.fromFuture {
      IO(underlying.getFaceSearch(getFaceSearchRequest))
    }

  def getFaceSearchPaginator(getFaceSearchRequest: GetFaceSearchRequest): GetFaceSearchPublisher =
    underlying.getFaceSearchPaginator(getFaceSearchRequest)

  override def getLabelDetection(getLabelDetectionRequest: GetLabelDetectionRequest): IO[GetLabelDetectionResponse] =
    IO.fromFuture {
      IO(underlying.getLabelDetection(getLabelDetectionRequest))
    }

  def getLabelDetectionPaginator(getLabelDetectionRequest: GetLabelDetectionRequest): GetLabelDetectionPublisher =
    underlying.getLabelDetectionPaginator(getLabelDetectionRequest)

  override def getPersonTracking(getPersonTrackingRequest: GetPersonTrackingRequest): IO[GetPersonTrackingResponse] =
    IO.fromFuture {
      IO(underlying.getPersonTracking(getPersonTrackingRequest))
    }

  def getPersonTrackingPaginator(getPersonTrackingRequest: GetPersonTrackingRequest): GetPersonTrackingPublisher =
    underlying.getPersonTrackingPaginator(getPersonTrackingRequest)

  override def indexFaces(indexFacesRequest: IndexFacesRequest): IO[IndexFacesResponse] =
    IO.fromFuture {
      IO(underlying.indexFaces(indexFacesRequest))
    }

  override def listCollections(listCollectionsRequest: ListCollectionsRequest): IO[ListCollectionsResponse] =
    IO.fromFuture {
      IO(underlying.listCollections(listCollectionsRequest))
    }

  override def listCollections(): IO[ListCollectionsResponse] =
    IO.fromFuture {
      IO(underlying.listCollections())
    }

  def listCollectionsPaginator(): ListCollectionsPublisher =
    underlying.listCollectionsPaginator()

  def listCollectionsPaginator(listCollectionsRequest: ListCollectionsRequest): ListCollectionsPublisher =
    underlying.listCollectionsPaginator(listCollectionsRequest)

  override def listFaces(listFacesRequest: ListFacesRequest): IO[ListFacesResponse] =
    IO.fromFuture {
      IO(underlying.listFaces(listFacesRequest))
    }

  def listFacesPaginator(listFacesRequest: ListFacesRequest): ListFacesPublisher =
    underlying.listFacesPaginator(listFacesRequest)

  override def listStreamProcessors(
      listStreamProcessorsRequest: ListStreamProcessorsRequest
  ): IO[ListStreamProcessorsResponse] =
    IO.fromFuture {
      IO(underlying.listStreamProcessors(listStreamProcessorsRequest))
    }

  override def listStreamProcessors(): IO[ListStreamProcessorsResponse] =
    IO.fromFuture {
      IO(underlying.listStreamProcessors())
    }

  def listStreamProcessorsPaginator(): ListStreamProcessorsPublisher =
    underlying.listStreamProcessorsPaginator()

  def listStreamProcessorsPaginator(
      listStreamProcessorsRequest: ListStreamProcessorsRequest
  ): ListStreamProcessorsPublisher =
    underlying.listStreamProcessorsPaginator(listStreamProcessorsRequest)

  override def recognizeCelebrities(
      recognizeCelebritiesRequest: RecognizeCelebritiesRequest
  ): IO[RecognizeCelebritiesResponse] =
    IO.fromFuture {
      IO(underlying.recognizeCelebrities(recognizeCelebritiesRequest))
    }

  override def searchFaces(searchFacesRequest: SearchFacesRequest): IO[SearchFacesResponse] =
    IO.fromFuture {
      IO(underlying.searchFaces(searchFacesRequest))
    }

  override def searchFacesByImage(
      searchFacesByImageRequest: SearchFacesByImageRequest
  ): IO[SearchFacesByImageResponse] =
    IO.fromFuture {
      IO(underlying.searchFacesByImage(searchFacesByImageRequest))
    }

  override def startCelebrityRecognition(
      startCelebrityRecognitionRequest: StartCelebrityRecognitionRequest
  ): IO[StartCelebrityRecognitionResponse] =
    IO.fromFuture {
      IO(underlying.startCelebrityRecognition(startCelebrityRecognitionRequest))
    }

  override def startContentModeration(
      startContentModerationRequest: StartContentModerationRequest
  ): IO[StartContentModerationResponse] =
    IO.fromFuture {
      IO(underlying.startContentModeration(startContentModerationRequest))
    }

  override def startFaceDetection(
      startFaceDetectionRequest: StartFaceDetectionRequest
  ): IO[StartFaceDetectionResponse] =
    IO.fromFuture {
      IO(underlying.startFaceDetection(startFaceDetectionRequest))
    }

  override def startFaceSearch(startFaceSearchRequest: StartFaceSearchRequest): IO[StartFaceSearchResponse] =
    IO.fromFuture {
      IO(underlying.startFaceSearch(startFaceSearchRequest))
    }

  override def startLabelDetection(
      startLabelDetectionRequest: StartLabelDetectionRequest
  ): IO[StartLabelDetectionResponse] =
    IO.fromFuture {
      IO(underlying.startLabelDetection(startLabelDetectionRequest))
    }

  override def startPersonTracking(
      startPersonTrackingRequest: StartPersonTrackingRequest
  ): IO[StartPersonTrackingResponse] =
    IO.fromFuture {
      IO(underlying.startPersonTracking(startPersonTrackingRequest))
    }

  override def startProjectVersion(
      startProjectVersionRequest: StartProjectVersionRequest
  ): IO[StartProjectVersionResponse] =
    IO.fromFuture {
      IO(underlying.startProjectVersion(startProjectVersionRequest))
    }

  override def startStreamProcessor(
      startStreamProcessorRequest: StartStreamProcessorRequest
  ): IO[StartStreamProcessorResponse] =
    IO.fromFuture {
      IO(underlying.startStreamProcessor(startStreamProcessorRequest))
    }

  override def stopProjectVersion(
      stopProjectVersionRequest: StopProjectVersionRequest
  ): IO[StopProjectVersionResponse] =
    IO.fromFuture {
      IO(underlying.stopProjectVersion(stopProjectVersionRequest))
    }

  override def stopStreamProcessor(
      stopStreamProcessorRequest: StopStreamProcessorRequest
  ): IO[StopStreamProcessorResponse] =
    IO.fromFuture {
      IO(underlying.stopStreamProcessor(stopStreamProcessorRequest))
    }

}
