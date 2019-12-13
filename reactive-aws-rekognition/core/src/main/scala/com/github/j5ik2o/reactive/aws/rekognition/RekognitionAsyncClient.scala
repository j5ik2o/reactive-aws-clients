// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition

import software.amazon.awssdk.services.rekognition.model._
import software.amazon.awssdk.services.rekognition.paginators._
import software.amazon.awssdk.services.rekognition.{ RekognitionAsyncClient => JavaRekognitionAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object RekognitionAsyncClient {

  def apply(javaClient: JavaRekognitionAsyncClient): RekognitionAsyncClient =
    new RekognitionAsyncClient {
      override val underlying: JavaRekognitionAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/rekognition/RekognitionAsyncClient.html
  */
trait RekognitionAsyncClient extends RekognitionClient[Future] {
  val underlying: JavaRekognitionAsyncClient

  override def compareFaces(compareFacesRequest: CompareFacesRequest): Future[CompareFacesResponse] =
    underlying.compareFaces(compareFacesRequest).toScala

  override def createCollection(createCollectionRequest: CreateCollectionRequest): Future[CreateCollectionResponse] =
    underlying.createCollection(createCollectionRequest).toScala

  override def createProject(createProjectRequest: CreateProjectRequest): Future[CreateProjectResponse] =
    underlying.createProject(createProjectRequest).toScala

  override def createProjectVersion(
      createProjectVersionRequest: CreateProjectVersionRequest
  ): Future[CreateProjectVersionResponse] =
    underlying.createProjectVersion(createProjectVersionRequest).toScala

  override def createStreamProcessor(
      createStreamProcessorRequest: CreateStreamProcessorRequest
  ): Future[CreateStreamProcessorResponse] =
    underlying.createStreamProcessor(createStreamProcessorRequest).toScala

  override def deleteCollection(deleteCollectionRequest: DeleteCollectionRequest): Future[DeleteCollectionResponse] =
    underlying.deleteCollection(deleteCollectionRequest).toScala

  override def deleteFaces(deleteFacesRequest: DeleteFacesRequest): Future[DeleteFacesResponse] =
    underlying.deleteFaces(deleteFacesRequest).toScala

  override def deleteStreamProcessor(
      deleteStreamProcessorRequest: DeleteStreamProcessorRequest
  ): Future[DeleteStreamProcessorResponse] =
    underlying.deleteStreamProcessor(deleteStreamProcessorRequest).toScala

  override def describeCollection(
      describeCollectionRequest: DescribeCollectionRequest
  ): Future[DescribeCollectionResponse] =
    underlying.describeCollection(describeCollectionRequest).toScala

  override def describeProjectVersions(
      describeProjectVersionsRequest: DescribeProjectVersionsRequest
  ): Future[DescribeProjectVersionsResponse] =
    underlying.describeProjectVersions(describeProjectVersionsRequest).toScala

  def describeProjectVersionsPaginator(
      describeProjectVersionsRequest: DescribeProjectVersionsRequest
  ): DescribeProjectVersionsPublisher =
    underlying.describeProjectVersionsPaginator(describeProjectVersionsRequest)

  override def describeProjects(describeProjectsRequest: DescribeProjectsRequest): Future[DescribeProjectsResponse] =
    underlying.describeProjects(describeProjectsRequest).toScala

  def describeProjectsPaginator(describeProjectsRequest: DescribeProjectsRequest): DescribeProjectsPublisher =
    underlying.describeProjectsPaginator(describeProjectsRequest)

  override def describeStreamProcessor(
      describeStreamProcessorRequest: DescribeStreamProcessorRequest
  ): Future[DescribeStreamProcessorResponse] =
    underlying.describeStreamProcessor(describeStreamProcessorRequest).toScala

  override def detectCustomLabels(
      detectCustomLabelsRequest: DetectCustomLabelsRequest
  ): Future[DetectCustomLabelsResponse] =
    underlying.detectCustomLabels(detectCustomLabelsRequest).toScala

  override def detectFaces(detectFacesRequest: DetectFacesRequest): Future[DetectFacesResponse] =
    underlying.detectFaces(detectFacesRequest).toScala

  override def detectLabels(detectLabelsRequest: DetectLabelsRequest): Future[DetectLabelsResponse] =
    underlying.detectLabels(detectLabelsRequest).toScala

  override def detectModerationLabels(
      detectModerationLabelsRequest: DetectModerationLabelsRequest
  ): Future[DetectModerationLabelsResponse] =
    underlying.detectModerationLabels(detectModerationLabelsRequest).toScala

  override def detectText(detectTextRequest: DetectTextRequest): Future[DetectTextResponse] =
    underlying.detectText(detectTextRequest).toScala

  override def getCelebrityInfo(getCelebrityInfoRequest: GetCelebrityInfoRequest): Future[GetCelebrityInfoResponse] =
    underlying.getCelebrityInfo(getCelebrityInfoRequest).toScala

  override def getCelebrityRecognition(
      getCelebrityRecognitionRequest: GetCelebrityRecognitionRequest
  ): Future[GetCelebrityRecognitionResponse] =
    underlying.getCelebrityRecognition(getCelebrityRecognitionRequest).toScala

  def getCelebrityRecognitionPaginator(
      getCelebrityRecognitionRequest: GetCelebrityRecognitionRequest
  ): GetCelebrityRecognitionPublisher =
    underlying.getCelebrityRecognitionPaginator(getCelebrityRecognitionRequest)

  override def getContentModeration(
      getContentModerationRequest: GetContentModerationRequest
  ): Future[GetContentModerationResponse] =
    underlying.getContentModeration(getContentModerationRequest).toScala

  def getContentModerationPaginator(
      getContentModerationRequest: GetContentModerationRequest
  ): GetContentModerationPublisher =
    underlying.getContentModerationPaginator(getContentModerationRequest)

  override def getFaceDetection(getFaceDetectionRequest: GetFaceDetectionRequest): Future[GetFaceDetectionResponse] =
    underlying.getFaceDetection(getFaceDetectionRequest).toScala

  def getFaceDetectionPaginator(getFaceDetectionRequest: GetFaceDetectionRequest): GetFaceDetectionPublisher =
    underlying.getFaceDetectionPaginator(getFaceDetectionRequest)

  override def getFaceSearch(getFaceSearchRequest: GetFaceSearchRequest): Future[GetFaceSearchResponse] =
    underlying.getFaceSearch(getFaceSearchRequest).toScala

  def getFaceSearchPaginator(getFaceSearchRequest: GetFaceSearchRequest): GetFaceSearchPublisher =
    underlying.getFaceSearchPaginator(getFaceSearchRequest)

  override def getLabelDetection(
      getLabelDetectionRequest: GetLabelDetectionRequest
  ): Future[GetLabelDetectionResponse] =
    underlying.getLabelDetection(getLabelDetectionRequest).toScala

  def getLabelDetectionPaginator(getLabelDetectionRequest: GetLabelDetectionRequest): GetLabelDetectionPublisher =
    underlying.getLabelDetectionPaginator(getLabelDetectionRequest)

  override def getPersonTracking(
      getPersonTrackingRequest: GetPersonTrackingRequest
  ): Future[GetPersonTrackingResponse] =
    underlying.getPersonTracking(getPersonTrackingRequest).toScala

  def getPersonTrackingPaginator(getPersonTrackingRequest: GetPersonTrackingRequest): GetPersonTrackingPublisher =
    underlying.getPersonTrackingPaginator(getPersonTrackingRequest)

  override def indexFaces(indexFacesRequest: IndexFacesRequest): Future[IndexFacesResponse] =
    underlying.indexFaces(indexFacesRequest).toScala

  override def listCollections(listCollectionsRequest: ListCollectionsRequest): Future[ListCollectionsResponse] =
    underlying.listCollections(listCollectionsRequest).toScala

  override def listCollections(): Future[ListCollectionsResponse] =
    underlying.listCollections().toScala

  def listCollectionsPaginator(): ListCollectionsPublisher =
    underlying.listCollectionsPaginator()

  def listCollectionsPaginator(listCollectionsRequest: ListCollectionsRequest): ListCollectionsPublisher =
    underlying.listCollectionsPaginator(listCollectionsRequest)

  override def listFaces(listFacesRequest: ListFacesRequest): Future[ListFacesResponse] =
    underlying.listFaces(listFacesRequest).toScala

  def listFacesPaginator(listFacesRequest: ListFacesRequest): ListFacesPublisher =
    underlying.listFacesPaginator(listFacesRequest)

  override def listStreamProcessors(
      listStreamProcessorsRequest: ListStreamProcessorsRequest
  ): Future[ListStreamProcessorsResponse] =
    underlying.listStreamProcessors(listStreamProcessorsRequest).toScala

  override def listStreamProcessors(): Future[ListStreamProcessorsResponse] =
    underlying.listStreamProcessors().toScala

  def listStreamProcessorsPaginator(): ListStreamProcessorsPublisher =
    underlying.listStreamProcessorsPaginator()

  def listStreamProcessorsPaginator(
      listStreamProcessorsRequest: ListStreamProcessorsRequest
  ): ListStreamProcessorsPublisher =
    underlying.listStreamProcessorsPaginator(listStreamProcessorsRequest)

  override def recognizeCelebrities(
      recognizeCelebritiesRequest: RecognizeCelebritiesRequest
  ): Future[RecognizeCelebritiesResponse] =
    underlying.recognizeCelebrities(recognizeCelebritiesRequest).toScala

  override def searchFaces(searchFacesRequest: SearchFacesRequest): Future[SearchFacesResponse] =
    underlying.searchFaces(searchFacesRequest).toScala

  override def searchFacesByImage(
      searchFacesByImageRequest: SearchFacesByImageRequest
  ): Future[SearchFacesByImageResponse] =
    underlying.searchFacesByImage(searchFacesByImageRequest).toScala

  override def startCelebrityRecognition(
      startCelebrityRecognitionRequest: StartCelebrityRecognitionRequest
  ): Future[StartCelebrityRecognitionResponse] =
    underlying.startCelebrityRecognition(startCelebrityRecognitionRequest).toScala

  override def startContentModeration(
      startContentModerationRequest: StartContentModerationRequest
  ): Future[StartContentModerationResponse] =
    underlying.startContentModeration(startContentModerationRequest).toScala

  override def startFaceDetection(
      startFaceDetectionRequest: StartFaceDetectionRequest
  ): Future[StartFaceDetectionResponse] =
    underlying.startFaceDetection(startFaceDetectionRequest).toScala

  override def startFaceSearch(startFaceSearchRequest: StartFaceSearchRequest): Future[StartFaceSearchResponse] =
    underlying.startFaceSearch(startFaceSearchRequest).toScala

  override def startLabelDetection(
      startLabelDetectionRequest: StartLabelDetectionRequest
  ): Future[StartLabelDetectionResponse] =
    underlying.startLabelDetection(startLabelDetectionRequest).toScala

  override def startPersonTracking(
      startPersonTrackingRequest: StartPersonTrackingRequest
  ): Future[StartPersonTrackingResponse] =
    underlying.startPersonTracking(startPersonTrackingRequest).toScala

  override def startProjectVersion(
      startProjectVersionRequest: StartProjectVersionRequest
  ): Future[StartProjectVersionResponse] =
    underlying.startProjectVersion(startProjectVersionRequest).toScala

  override def startStreamProcessor(
      startStreamProcessorRequest: StartStreamProcessorRequest
  ): Future[StartStreamProcessorResponse] =
    underlying.startStreamProcessor(startStreamProcessorRequest).toScala

  override def stopProjectVersion(
      stopProjectVersionRequest: StopProjectVersionRequest
  ): Future[StopProjectVersionResponse] =
    underlying.stopProjectVersion(stopProjectVersionRequest).toScala

  override def stopStreamProcessor(
      stopStreamProcessorRequest: StopStreamProcessorRequest
  ): Future[StopStreamProcessorResponse] =
    underlying.stopStreamProcessor(stopStreamProcessorRequest).toScala

}
