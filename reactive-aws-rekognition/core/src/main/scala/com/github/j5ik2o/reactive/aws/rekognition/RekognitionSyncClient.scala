// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.rekognition.model._
import software.amazon.awssdk.services.rekognition.paginators._
import software.amazon.awssdk.services.rekognition.{ RekognitionClient => JavaRekognitionSyncClient }

object RekognitionSyncClient extends ToEitherSupport {

  def apply(javaClient: JavaRekognitionSyncClient): RekognitionSyncClient =
    new RekognitionSyncClient {
      override val underlying: JavaRekognitionSyncClient = javaClient
    }
}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/rekognition/RekognitionClient.html */
trait RekognitionSyncClient extends RekognitionClient[Either[Throwable, ?]] {
  val underlying: JavaRekognitionSyncClient

  import RekognitionSyncClient._

  override def compareFaces(compareFacesRequest: CompareFacesRequest): Either[Throwable, CompareFacesResponse] =
    underlying.compareFaces(compareFacesRequest).toEither

  override def createCollection(
      createCollectionRequest: CreateCollectionRequest
  ): Either[Throwable, CreateCollectionResponse] =
    underlying.createCollection(createCollectionRequest).toEither

  override def createProject(createProjectRequest: CreateProjectRequest): Either[Throwable, CreateProjectResponse] =
    underlying.createProject(createProjectRequest).toEither

  override def createProjectVersion(
      createProjectVersionRequest: CreateProjectVersionRequest
  ): Either[Throwable, CreateProjectVersionResponse] =
    underlying.createProjectVersion(createProjectVersionRequest).toEither

  override def createStreamProcessor(
      createStreamProcessorRequest: CreateStreamProcessorRequest
  ): Either[Throwable, CreateStreamProcessorResponse] =
    underlying.createStreamProcessor(createStreamProcessorRequest).toEither

  override def deleteCollection(
      deleteCollectionRequest: DeleteCollectionRequest
  ): Either[Throwable, DeleteCollectionResponse] =
    underlying.deleteCollection(deleteCollectionRequest).toEither

  override def deleteFaces(deleteFacesRequest: DeleteFacesRequest): Either[Throwable, DeleteFacesResponse] =
    underlying.deleteFaces(deleteFacesRequest).toEither

  override def deleteProject(deleteProjectRequest: DeleteProjectRequest): Either[Throwable, DeleteProjectResponse] =
    underlying.deleteProject(deleteProjectRequest).toEither

  override def deleteProjectVersion(
      deleteProjectVersionRequest: DeleteProjectVersionRequest
  ): Either[Throwable, DeleteProjectVersionResponse] =
    underlying.deleteProjectVersion(deleteProjectVersionRequest).toEither

  override def deleteStreamProcessor(
      deleteStreamProcessorRequest: DeleteStreamProcessorRequest
  ): Either[Throwable, DeleteStreamProcessorResponse] =
    underlying.deleteStreamProcessor(deleteStreamProcessorRequest).toEither

  override def describeCollection(
      describeCollectionRequest: DescribeCollectionRequest
  ): Either[Throwable, DescribeCollectionResponse] =
    underlying.describeCollection(describeCollectionRequest).toEither

  override def describeProjectVersions(
      describeProjectVersionsRequest: DescribeProjectVersionsRequest
  ): Either[Throwable, DescribeProjectVersionsResponse] =
    underlying.describeProjectVersions(describeProjectVersionsRequest).toEither

  def describeProjectVersionsPaginator(
      describeProjectVersionsRequest: DescribeProjectVersionsRequest
  ): DescribeProjectVersionsIterable =
    underlying.describeProjectVersionsPaginator(describeProjectVersionsRequest)

  override def describeProjects(
      describeProjectsRequest: DescribeProjectsRequest
  ): Either[Throwable, DescribeProjectsResponse] =
    underlying.describeProjects(describeProjectsRequest).toEither

  def describeProjectsPaginator(describeProjectsRequest: DescribeProjectsRequest): DescribeProjectsIterable =
    underlying.describeProjectsPaginator(describeProjectsRequest)

  override def describeStreamProcessor(
      describeStreamProcessorRequest: DescribeStreamProcessorRequest
  ): Either[Throwable, DescribeStreamProcessorResponse] =
    underlying.describeStreamProcessor(describeStreamProcessorRequest).toEither

  override def detectCustomLabels(
      detectCustomLabelsRequest: DetectCustomLabelsRequest
  ): Either[Throwable, DetectCustomLabelsResponse] =
    underlying.detectCustomLabels(detectCustomLabelsRequest).toEither

  override def detectFaces(detectFacesRequest: DetectFacesRequest): Either[Throwable, DetectFacesResponse] =
    underlying.detectFaces(detectFacesRequest).toEither

  override def detectLabels(detectLabelsRequest: DetectLabelsRequest): Either[Throwable, DetectLabelsResponse] =
    underlying.detectLabels(detectLabelsRequest).toEither

  override def detectModerationLabels(
      detectModerationLabelsRequest: DetectModerationLabelsRequest
  ): Either[Throwable, DetectModerationLabelsResponse] =
    underlying.detectModerationLabels(detectModerationLabelsRequest).toEither

  override def detectText(detectTextRequest: DetectTextRequest): Either[Throwable, DetectTextResponse] =
    underlying.detectText(detectTextRequest).toEither

  override def getCelebrityInfo(
      getCelebrityInfoRequest: GetCelebrityInfoRequest
  ): Either[Throwable, GetCelebrityInfoResponse] =
    underlying.getCelebrityInfo(getCelebrityInfoRequest).toEither

  override def getCelebrityRecognition(
      getCelebrityRecognitionRequest: GetCelebrityRecognitionRequest
  ): Either[Throwable, GetCelebrityRecognitionResponse] =
    underlying.getCelebrityRecognition(getCelebrityRecognitionRequest).toEither

  def getCelebrityRecognitionPaginator(
      getCelebrityRecognitionRequest: GetCelebrityRecognitionRequest
  ): GetCelebrityRecognitionIterable =
    underlying.getCelebrityRecognitionPaginator(getCelebrityRecognitionRequest)

  override def getContentModeration(
      getContentModerationRequest: GetContentModerationRequest
  ): Either[Throwable, GetContentModerationResponse] =
    underlying.getContentModeration(getContentModerationRequest).toEither

  def getContentModerationPaginator(
      getContentModerationRequest: GetContentModerationRequest
  ): GetContentModerationIterable =
    underlying.getContentModerationPaginator(getContentModerationRequest)

  override def getFaceDetection(
      getFaceDetectionRequest: GetFaceDetectionRequest
  ): Either[Throwable, GetFaceDetectionResponse] =
    underlying.getFaceDetection(getFaceDetectionRequest).toEither

  def getFaceDetectionPaginator(getFaceDetectionRequest: GetFaceDetectionRequest): GetFaceDetectionIterable =
    underlying.getFaceDetectionPaginator(getFaceDetectionRequest)

  override def getFaceSearch(getFaceSearchRequest: GetFaceSearchRequest): Either[Throwable, GetFaceSearchResponse] =
    underlying.getFaceSearch(getFaceSearchRequest).toEither

  def getFaceSearchPaginator(getFaceSearchRequest: GetFaceSearchRequest): GetFaceSearchIterable =
    underlying.getFaceSearchPaginator(getFaceSearchRequest)

  override def getLabelDetection(
      getLabelDetectionRequest: GetLabelDetectionRequest
  ): Either[Throwable, GetLabelDetectionResponse] =
    underlying.getLabelDetection(getLabelDetectionRequest).toEither

  def getLabelDetectionPaginator(getLabelDetectionRequest: GetLabelDetectionRequest): GetLabelDetectionIterable =
    underlying.getLabelDetectionPaginator(getLabelDetectionRequest)

  override def getPersonTracking(
      getPersonTrackingRequest: GetPersonTrackingRequest
  ): Either[Throwable, GetPersonTrackingResponse] =
    underlying.getPersonTracking(getPersonTrackingRequest).toEither

  def getPersonTrackingPaginator(getPersonTrackingRequest: GetPersonTrackingRequest): GetPersonTrackingIterable =
    underlying.getPersonTrackingPaginator(getPersonTrackingRequest)

  override def getSegmentDetection(
      getSegmentDetectionRequest: GetSegmentDetectionRequest
  ): Either[Throwable, GetSegmentDetectionResponse] =
    underlying.getSegmentDetection(getSegmentDetectionRequest).toEither

  def getSegmentDetectionPaginator(
      getSegmentDetectionRequest: GetSegmentDetectionRequest
  ): GetSegmentDetectionIterable =
    underlying.getSegmentDetectionPaginator(getSegmentDetectionRequest)

  override def getTextDetection(
      getTextDetectionRequest: GetTextDetectionRequest
  ): Either[Throwable, GetTextDetectionResponse] =
    underlying.getTextDetection(getTextDetectionRequest).toEither

  def getTextDetectionPaginator(getTextDetectionRequest: GetTextDetectionRequest): GetTextDetectionIterable =
    underlying.getTextDetectionPaginator(getTextDetectionRequest)

  override def indexFaces(indexFacesRequest: IndexFacesRequest): Either[Throwable, IndexFacesResponse] =
    underlying.indexFaces(indexFacesRequest).toEither

  override def listCollections(): Either[Throwable, ListCollectionsResponse] =
    underlying.listCollections().toEither

  override def listCollections(
      listCollectionsRequest: ListCollectionsRequest
  ): Either[Throwable, ListCollectionsResponse] =
    underlying.listCollections(listCollectionsRequest).toEither

  def listCollectionsPaginator(): ListCollectionsIterable =
    underlying.listCollectionsPaginator()

  def listCollectionsPaginator(listCollectionsRequest: ListCollectionsRequest): ListCollectionsIterable =
    underlying.listCollectionsPaginator(listCollectionsRequest)

  override def listFaces(listFacesRequest: ListFacesRequest): Either[Throwable, ListFacesResponse] =
    underlying.listFaces(listFacesRequest).toEither

  def listFacesPaginator(listFacesRequest: ListFacesRequest): ListFacesIterable =
    underlying.listFacesPaginator(listFacesRequest)

  override def listStreamProcessors(): Either[Throwable, ListStreamProcessorsResponse] =
    underlying.listStreamProcessors().toEither

  override def listStreamProcessors(
      listStreamProcessorsRequest: ListStreamProcessorsRequest
  ): Either[Throwable, ListStreamProcessorsResponse] =
    underlying.listStreamProcessors(listStreamProcessorsRequest).toEither

  def listStreamProcessorsPaginator(): ListStreamProcessorsIterable =
    underlying.listStreamProcessorsPaginator()

  def listStreamProcessorsPaginator(
      listStreamProcessorsRequest: ListStreamProcessorsRequest
  ): ListStreamProcessorsIterable =
    underlying.listStreamProcessorsPaginator(listStreamProcessorsRequest)

  override def recognizeCelebrities(
      recognizeCelebritiesRequest: RecognizeCelebritiesRequest
  ): Either[Throwable, RecognizeCelebritiesResponse] =
    underlying.recognizeCelebrities(recognizeCelebritiesRequest).toEither

  override def searchFaces(searchFacesRequest: SearchFacesRequest): Either[Throwable, SearchFacesResponse] =
    underlying.searchFaces(searchFacesRequest).toEither

  override def searchFacesByImage(
      searchFacesByImageRequest: SearchFacesByImageRequest
  ): Either[Throwable, SearchFacesByImageResponse] =
    underlying.searchFacesByImage(searchFacesByImageRequest).toEither

  override def startCelebrityRecognition(
      startCelebrityRecognitionRequest: StartCelebrityRecognitionRequest
  ): Either[Throwable, StartCelebrityRecognitionResponse] =
    underlying.startCelebrityRecognition(startCelebrityRecognitionRequest).toEither

  override def startContentModeration(
      startContentModerationRequest: StartContentModerationRequest
  ): Either[Throwable, StartContentModerationResponse] =
    underlying.startContentModeration(startContentModerationRequest).toEither

  override def startFaceDetection(
      startFaceDetectionRequest: StartFaceDetectionRequest
  ): Either[Throwable, StartFaceDetectionResponse] =
    underlying.startFaceDetection(startFaceDetectionRequest).toEither

  override def startFaceSearch(
      startFaceSearchRequest: StartFaceSearchRequest
  ): Either[Throwable, StartFaceSearchResponse] =
    underlying.startFaceSearch(startFaceSearchRequest).toEither

  override def startLabelDetection(
      startLabelDetectionRequest: StartLabelDetectionRequest
  ): Either[Throwable, StartLabelDetectionResponse] =
    underlying.startLabelDetection(startLabelDetectionRequest).toEither

  override def startPersonTracking(
      startPersonTrackingRequest: StartPersonTrackingRequest
  ): Either[Throwable, StartPersonTrackingResponse] =
    underlying.startPersonTracking(startPersonTrackingRequest).toEither

  override def startProjectVersion(
      startProjectVersionRequest: StartProjectVersionRequest
  ): Either[Throwable, StartProjectVersionResponse] =
    underlying.startProjectVersion(startProjectVersionRequest).toEither

  override def startSegmentDetection(
      startSegmentDetectionRequest: StartSegmentDetectionRequest
  ): Either[Throwable, StartSegmentDetectionResponse] =
    underlying.startSegmentDetection(startSegmentDetectionRequest).toEither

  override def startStreamProcessor(
      startStreamProcessorRequest: StartStreamProcessorRequest
  ): Either[Throwable, StartStreamProcessorResponse] =
    underlying.startStreamProcessor(startStreamProcessorRequest).toEither

  override def startTextDetection(
      startTextDetectionRequest: StartTextDetectionRequest
  ): Either[Throwable, StartTextDetectionResponse] =
    underlying.startTextDetection(startTextDetectionRequest).toEither

  override def stopProjectVersion(
      stopProjectVersionRequest: StopProjectVersionRequest
  ): Either[Throwable, StopProjectVersionResponse] =
    underlying.stopProjectVersion(stopProjectVersionRequest).toEither

  override def stopStreamProcessor(
      stopStreamProcessorRequest: StopStreamProcessorRequest
  ): Either[Throwable, StopStreamProcessorResponse] =
    underlying.stopStreamProcessor(stopStreamProcessorRequest).toEither

}
