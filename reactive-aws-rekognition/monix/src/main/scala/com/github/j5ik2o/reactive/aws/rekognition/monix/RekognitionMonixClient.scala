// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.monix

import software.amazon.awssdk.services.rekognition.model._
import com.github.j5ik2o.reactive.aws.rekognition.{ RekognitionAsyncClient, RekognitionClient }
import monix.eval.Task
import monix.reactive.Observable

object RekognitionMonixClient {

  def apply(asyncClient: RekognitionAsyncClient): RekognitionMonixClient = new RekognitionMonixClient {
    override val underlying: RekognitionAsyncClient = asyncClient
  }

}

trait RekognitionMonixClient extends RekognitionClient[Task] {

  val underlying: RekognitionAsyncClient

  override def compareFaces(compareFacesRequest: CompareFacesRequest): Task[CompareFacesResponse] =
    Task.deferFuture {
      underlying.compareFaces(compareFacesRequest)
    }

  override def createCollection(createCollectionRequest: CreateCollectionRequest): Task[CreateCollectionResponse] =
    Task.deferFuture {
      underlying.createCollection(createCollectionRequest)
    }

  override def createProject(createProjectRequest: CreateProjectRequest): Task[CreateProjectResponse] =
    Task.deferFuture {
      underlying.createProject(createProjectRequest)
    }

  override def createProjectVersion(
      createProjectVersionRequest: CreateProjectVersionRequest
  ): Task[CreateProjectVersionResponse] =
    Task.deferFuture {
      underlying.createProjectVersion(createProjectVersionRequest)
    }

  override def createStreamProcessor(
      createStreamProcessorRequest: CreateStreamProcessorRequest
  ): Task[CreateStreamProcessorResponse] =
    Task.deferFuture {
      underlying.createStreamProcessor(createStreamProcessorRequest)
    }

  override def deleteCollection(deleteCollectionRequest: DeleteCollectionRequest): Task[DeleteCollectionResponse] =
    Task.deferFuture {
      underlying.deleteCollection(deleteCollectionRequest)
    }

  override def deleteFaces(deleteFacesRequest: DeleteFacesRequest): Task[DeleteFacesResponse] =
    Task.deferFuture {
      underlying.deleteFaces(deleteFacesRequest)
    }

  override def deleteStreamProcessor(
      deleteStreamProcessorRequest: DeleteStreamProcessorRequest
  ): Task[DeleteStreamProcessorResponse] =
    Task.deferFuture {
      underlying.deleteStreamProcessor(deleteStreamProcessorRequest)
    }

  override def describeCollection(
      describeCollectionRequest: DescribeCollectionRequest
  ): Task[DescribeCollectionResponse] =
    Task.deferFuture {
      underlying.describeCollection(describeCollectionRequest)
    }

  override def describeProjectVersions(
      describeProjectVersionsRequest: DescribeProjectVersionsRequest
  ): Task[DescribeProjectVersionsResponse] =
    Task.deferFuture {
      underlying.describeProjectVersions(describeProjectVersionsRequest)
    }

  def describeProjectVersionsPaginator(
      describeProjectVersionsRequest: DescribeProjectVersionsRequest
  ): Observable[DescribeProjectVersionsResponse] =
    Observable.fromReactivePublisher(underlying.describeProjectVersionsPaginator(describeProjectVersionsRequest))

  override def describeProjects(describeProjectsRequest: DescribeProjectsRequest): Task[DescribeProjectsResponse] =
    Task.deferFuture {
      underlying.describeProjects(describeProjectsRequest)
    }

  def describeProjectsPaginator(
      describeProjectsRequest: DescribeProjectsRequest
  ): Observable[DescribeProjectsResponse] =
    Observable.fromReactivePublisher(underlying.describeProjectsPaginator(describeProjectsRequest))

  override def describeStreamProcessor(
      describeStreamProcessorRequest: DescribeStreamProcessorRequest
  ): Task[DescribeStreamProcessorResponse] =
    Task.deferFuture {
      underlying.describeStreamProcessor(describeStreamProcessorRequest)
    }

  override def detectCustomLabels(
      detectCustomLabelsRequest: DetectCustomLabelsRequest
  ): Task[DetectCustomLabelsResponse] =
    Task.deferFuture {
      underlying.detectCustomLabels(detectCustomLabelsRequest)
    }

  override def detectFaces(detectFacesRequest: DetectFacesRequest): Task[DetectFacesResponse] =
    Task.deferFuture {
      underlying.detectFaces(detectFacesRequest)
    }

  override def detectLabels(detectLabelsRequest: DetectLabelsRequest): Task[DetectLabelsResponse] =
    Task.deferFuture {
      underlying.detectLabels(detectLabelsRequest)
    }

  override def detectModerationLabels(
      detectModerationLabelsRequest: DetectModerationLabelsRequest
  ): Task[DetectModerationLabelsResponse] =
    Task.deferFuture {
      underlying.detectModerationLabels(detectModerationLabelsRequest)
    }

  override def detectText(detectTextRequest: DetectTextRequest): Task[DetectTextResponse] =
    Task.deferFuture {
      underlying.detectText(detectTextRequest)
    }

  override def getCelebrityInfo(getCelebrityInfoRequest: GetCelebrityInfoRequest): Task[GetCelebrityInfoResponse] =
    Task.deferFuture {
      underlying.getCelebrityInfo(getCelebrityInfoRequest)
    }

  override def getCelebrityRecognition(
      getCelebrityRecognitionRequest: GetCelebrityRecognitionRequest
  ): Task[GetCelebrityRecognitionResponse] =
    Task.deferFuture {
      underlying.getCelebrityRecognition(getCelebrityRecognitionRequest)
    }

  def getCelebrityRecognitionPaginator(
      getCelebrityRecognitionRequest: GetCelebrityRecognitionRequest
  ): Observable[GetCelebrityRecognitionResponse] =
    Observable.fromReactivePublisher(underlying.getCelebrityRecognitionPaginator(getCelebrityRecognitionRequest))

  override def getContentModeration(
      getContentModerationRequest: GetContentModerationRequest
  ): Task[GetContentModerationResponse] =
    Task.deferFuture {
      underlying.getContentModeration(getContentModerationRequest)
    }

  def getContentModerationPaginator(
      getContentModerationRequest: GetContentModerationRequest
  ): Observable[GetContentModerationResponse] =
    Observable.fromReactivePublisher(underlying.getContentModerationPaginator(getContentModerationRequest))

  override def getFaceDetection(getFaceDetectionRequest: GetFaceDetectionRequest): Task[GetFaceDetectionResponse] =
    Task.deferFuture {
      underlying.getFaceDetection(getFaceDetectionRequest)
    }

  def getFaceDetectionPaginator(
      getFaceDetectionRequest: GetFaceDetectionRequest
  ): Observable[GetFaceDetectionResponse] =
    Observable.fromReactivePublisher(underlying.getFaceDetectionPaginator(getFaceDetectionRequest))

  override def getFaceSearch(getFaceSearchRequest: GetFaceSearchRequest): Task[GetFaceSearchResponse] =
    Task.deferFuture {
      underlying.getFaceSearch(getFaceSearchRequest)
    }

  def getFaceSearchPaginator(getFaceSearchRequest: GetFaceSearchRequest): Observable[GetFaceSearchResponse] =
    Observable.fromReactivePublisher(underlying.getFaceSearchPaginator(getFaceSearchRequest))

  override def getLabelDetection(getLabelDetectionRequest: GetLabelDetectionRequest): Task[GetLabelDetectionResponse] =
    Task.deferFuture {
      underlying.getLabelDetection(getLabelDetectionRequest)
    }

  def getLabelDetectionPaginator(
      getLabelDetectionRequest: GetLabelDetectionRequest
  ): Observable[GetLabelDetectionResponse] =
    Observable.fromReactivePublisher(underlying.getLabelDetectionPaginator(getLabelDetectionRequest))

  override def getPersonTracking(getPersonTrackingRequest: GetPersonTrackingRequest): Task[GetPersonTrackingResponse] =
    Task.deferFuture {
      underlying.getPersonTracking(getPersonTrackingRequest)
    }

  def getPersonTrackingPaginator(
      getPersonTrackingRequest: GetPersonTrackingRequest
  ): Observable[GetPersonTrackingResponse] =
    Observable.fromReactivePublisher(underlying.getPersonTrackingPaginator(getPersonTrackingRequest))

  override def indexFaces(indexFacesRequest: IndexFacesRequest): Task[IndexFacesResponse] =
    Task.deferFuture {
      underlying.indexFaces(indexFacesRequest)
    }

  override def listCollections(listCollectionsRequest: ListCollectionsRequest): Task[ListCollectionsResponse] =
    Task.deferFuture {
      underlying.listCollections(listCollectionsRequest)
    }

  override def listCollections(): Task[ListCollectionsResponse] =
    Task.deferFuture {
      underlying.listCollections()
    }

  def listCollectionsPaginator(): Observable[ListCollectionsResponse] =
    Observable.fromReactivePublisher(underlying.listCollectionsPaginator())

  def listCollectionsPaginator(listCollectionsRequest: ListCollectionsRequest): Observable[ListCollectionsResponse] =
    Observable.fromReactivePublisher(underlying.listCollectionsPaginator(listCollectionsRequest))

  override def listFaces(listFacesRequest: ListFacesRequest): Task[ListFacesResponse] =
    Task.deferFuture {
      underlying.listFaces(listFacesRequest)
    }

  def listFacesPaginator(listFacesRequest: ListFacesRequest): Observable[ListFacesResponse] =
    Observable.fromReactivePublisher(underlying.listFacesPaginator(listFacesRequest))

  override def listStreamProcessors(
      listStreamProcessorsRequest: ListStreamProcessorsRequest
  ): Task[ListStreamProcessorsResponse] =
    Task.deferFuture {
      underlying.listStreamProcessors(listStreamProcessorsRequest)
    }

  override def listStreamProcessors(): Task[ListStreamProcessorsResponse] =
    Task.deferFuture {
      underlying.listStreamProcessors()
    }

  def listStreamProcessorsPaginator(): Observable[ListStreamProcessorsResponse] =
    Observable.fromReactivePublisher(underlying.listStreamProcessorsPaginator())

  def listStreamProcessorsPaginator(
      listStreamProcessorsRequest: ListStreamProcessorsRequest
  ): Observable[ListStreamProcessorsResponse] =
    Observable.fromReactivePublisher(underlying.listStreamProcessorsPaginator(listStreamProcessorsRequest))

  override def recognizeCelebrities(
      recognizeCelebritiesRequest: RecognizeCelebritiesRequest
  ): Task[RecognizeCelebritiesResponse] =
    Task.deferFuture {
      underlying.recognizeCelebrities(recognizeCelebritiesRequest)
    }

  override def searchFaces(searchFacesRequest: SearchFacesRequest): Task[SearchFacesResponse] =
    Task.deferFuture {
      underlying.searchFaces(searchFacesRequest)
    }

  override def searchFacesByImage(
      searchFacesByImageRequest: SearchFacesByImageRequest
  ): Task[SearchFacesByImageResponse] =
    Task.deferFuture {
      underlying.searchFacesByImage(searchFacesByImageRequest)
    }

  override def startCelebrityRecognition(
      startCelebrityRecognitionRequest: StartCelebrityRecognitionRequest
  ): Task[StartCelebrityRecognitionResponse] =
    Task.deferFuture {
      underlying.startCelebrityRecognition(startCelebrityRecognitionRequest)
    }

  override def startContentModeration(
      startContentModerationRequest: StartContentModerationRequest
  ): Task[StartContentModerationResponse] =
    Task.deferFuture {
      underlying.startContentModeration(startContentModerationRequest)
    }

  override def startFaceDetection(
      startFaceDetectionRequest: StartFaceDetectionRequest
  ): Task[StartFaceDetectionResponse] =
    Task.deferFuture {
      underlying.startFaceDetection(startFaceDetectionRequest)
    }

  override def startFaceSearch(startFaceSearchRequest: StartFaceSearchRequest): Task[StartFaceSearchResponse] =
    Task.deferFuture {
      underlying.startFaceSearch(startFaceSearchRequest)
    }

  override def startLabelDetection(
      startLabelDetectionRequest: StartLabelDetectionRequest
  ): Task[StartLabelDetectionResponse] =
    Task.deferFuture {
      underlying.startLabelDetection(startLabelDetectionRequest)
    }

  override def startPersonTracking(
      startPersonTrackingRequest: StartPersonTrackingRequest
  ): Task[StartPersonTrackingResponse] =
    Task.deferFuture {
      underlying.startPersonTracking(startPersonTrackingRequest)
    }

  override def startProjectVersion(
      startProjectVersionRequest: StartProjectVersionRequest
  ): Task[StartProjectVersionResponse] =
    Task.deferFuture {
      underlying.startProjectVersion(startProjectVersionRequest)
    }

  override def startStreamProcessor(
      startStreamProcessorRequest: StartStreamProcessorRequest
  ): Task[StartStreamProcessorResponse] =
    Task.deferFuture {
      underlying.startStreamProcessor(startStreamProcessorRequest)
    }

  override def stopProjectVersion(
      stopProjectVersionRequest: StopProjectVersionRequest
  ): Task[StopProjectVersionResponse] =
    Task.deferFuture {
      underlying.stopProjectVersion(stopProjectVersionRequest)
    }

  override def stopStreamProcessor(
      stopStreamProcessorRequest: StopStreamProcessorRequest
  ): Task[StopStreamProcessorResponse] =
    Task.deferFuture {
      underlying.stopStreamProcessor(stopStreamProcessorRequest)
    }

}
