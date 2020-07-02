// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.rekognition.RekognitionAsyncClient
import software.amazon.awssdk.services.rekognition.model._

object RekognitionAkkaClient {

  def apply(asyncClient: RekognitionAsyncClient): RekognitionAkkaClient =
    new RekognitionAkkaClient {
      override val underlying: RekognitionAsyncClient = asyncClient
    }

  val DefaultParallelism: Int = 1

}

trait RekognitionAkkaClient {

  import RekognitionAkkaClient._

  val underlying: RekognitionAsyncClient

  def compareFacesSource(
      compareFacesRequest: CompareFacesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CompareFacesResponse, NotUsed] =
    Source.single(compareFacesRequest).via(compareFacesFlow(parallelism))

  def compareFacesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CompareFacesRequest, CompareFacesResponse, NotUsed] =
    Flow[CompareFacesRequest].mapAsync(parallelism) { compareFacesRequest =>
      underlying.compareFaces(compareFacesRequest)
    }

  def createCollectionSource(
      createCollectionRequest: CreateCollectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateCollectionResponse, NotUsed] =
    Source.single(createCollectionRequest).via(createCollectionFlow(parallelism))

  def createCollectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateCollectionRequest, CreateCollectionResponse, NotUsed] =
    Flow[CreateCollectionRequest].mapAsync(parallelism) { createCollectionRequest =>
      underlying.createCollection(createCollectionRequest)
    }

  def createProjectSource(
      createProjectRequest: CreateProjectRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateProjectResponse, NotUsed] =
    Source.single(createProjectRequest).via(createProjectFlow(parallelism))

  def createProjectFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateProjectRequest, CreateProjectResponse, NotUsed] =
    Flow[CreateProjectRequest].mapAsync(parallelism) { createProjectRequest =>
      underlying.createProject(createProjectRequest)
    }

  def createProjectVersionSource(
      createProjectVersionRequest: CreateProjectVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateProjectVersionResponse, NotUsed] =
    Source.single(createProjectVersionRequest).via(createProjectVersionFlow(parallelism))

  def createProjectVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateProjectVersionRequest, CreateProjectVersionResponse, NotUsed] =
    Flow[CreateProjectVersionRequest].mapAsync(parallelism) { createProjectVersionRequest =>
      underlying.createProjectVersion(createProjectVersionRequest)
    }

  def createStreamProcessorSource(
      createStreamProcessorRequest: CreateStreamProcessorRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateStreamProcessorResponse, NotUsed] =
    Source.single(createStreamProcessorRequest).via(createStreamProcessorFlow(parallelism))

  def createStreamProcessorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateStreamProcessorRequest, CreateStreamProcessorResponse, NotUsed] =
    Flow[CreateStreamProcessorRequest].mapAsync(parallelism) { createStreamProcessorRequest =>
      underlying.createStreamProcessor(createStreamProcessorRequest)
    }

  def deleteCollectionSource(
      deleteCollectionRequest: DeleteCollectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteCollectionResponse, NotUsed] =
    Source.single(deleteCollectionRequest).via(deleteCollectionFlow(parallelism))

  def deleteCollectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteCollectionRequest, DeleteCollectionResponse, NotUsed] =
    Flow[DeleteCollectionRequest].mapAsync(parallelism) { deleteCollectionRequest =>
      underlying.deleteCollection(deleteCollectionRequest)
    }

  def deleteFacesSource(
      deleteFacesRequest: DeleteFacesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteFacesResponse, NotUsed] =
    Source.single(deleteFacesRequest).via(deleteFacesFlow(parallelism))

  def deleteFacesFlow(parallelism: Int = DefaultParallelism): Flow[DeleteFacesRequest, DeleteFacesResponse, NotUsed] =
    Flow[DeleteFacesRequest].mapAsync(parallelism) { deleteFacesRequest =>
      underlying.deleteFaces(deleteFacesRequest)
    }

  def deleteProjectSource(
      deleteProjectRequest: DeleteProjectRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteProjectResponse, NotUsed] =
    Source.single(deleteProjectRequest).via(deleteProjectFlow(parallelism))

  def deleteProjectFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteProjectRequest, DeleteProjectResponse, NotUsed] =
    Flow[DeleteProjectRequest].mapAsync(parallelism) { deleteProjectRequest =>
      underlying.deleteProject(deleteProjectRequest)
    }

  def deleteProjectVersionSource(
      deleteProjectVersionRequest: DeleteProjectVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteProjectVersionResponse, NotUsed] =
    Source.single(deleteProjectVersionRequest).via(deleteProjectVersionFlow(parallelism))

  def deleteProjectVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteProjectVersionRequest, DeleteProjectVersionResponse, NotUsed] =
    Flow[DeleteProjectVersionRequest].mapAsync(parallelism) { deleteProjectVersionRequest =>
      underlying.deleteProjectVersion(deleteProjectVersionRequest)
    }

  def deleteStreamProcessorSource(
      deleteStreamProcessorRequest: DeleteStreamProcessorRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteStreamProcessorResponse, NotUsed] =
    Source.single(deleteStreamProcessorRequest).via(deleteStreamProcessorFlow(parallelism))

  def deleteStreamProcessorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteStreamProcessorRequest, DeleteStreamProcessorResponse, NotUsed] =
    Flow[DeleteStreamProcessorRequest].mapAsync(parallelism) { deleteStreamProcessorRequest =>
      underlying.deleteStreamProcessor(deleteStreamProcessorRequest)
    }

  def describeCollectionSource(
      describeCollectionRequest: DescribeCollectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeCollectionResponse, NotUsed] =
    Source.single(describeCollectionRequest).via(describeCollectionFlow(parallelism))

  def describeCollectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeCollectionRequest, DescribeCollectionResponse, NotUsed] =
    Flow[DescribeCollectionRequest].mapAsync(parallelism) { describeCollectionRequest =>
      underlying.describeCollection(describeCollectionRequest)
    }

  def describeProjectVersionsSource(
      describeProjectVersionsRequest: DescribeProjectVersionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeProjectVersionsResponse, NotUsed] =
    Source.single(describeProjectVersionsRequest).via(describeProjectVersionsFlow(parallelism))

  def describeProjectVersionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeProjectVersionsRequest, DescribeProjectVersionsResponse, NotUsed] =
    Flow[DescribeProjectVersionsRequest].mapAsync(parallelism) { describeProjectVersionsRequest =>
      underlying.describeProjectVersions(describeProjectVersionsRequest)
    }

  def describeProjectVersionsPaginatorFlow
      : Flow[DescribeProjectVersionsRequest, DescribeProjectVersionsResponse, NotUsed] =
    Flow[DescribeProjectVersionsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeProjectVersionsPaginator(request))
    }

  def describeProjectsSource(
      describeProjectsRequest: DescribeProjectsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeProjectsResponse, NotUsed] =
    Source.single(describeProjectsRequest).via(describeProjectsFlow(parallelism))

  def describeProjectsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeProjectsRequest, DescribeProjectsResponse, NotUsed] =
    Flow[DescribeProjectsRequest].mapAsync(parallelism) { describeProjectsRequest =>
      underlying.describeProjects(describeProjectsRequest)
    }

  def describeProjectsPaginatorFlow: Flow[DescribeProjectsRequest, DescribeProjectsResponse, NotUsed] =
    Flow[DescribeProjectsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeProjectsPaginator(request))
    }

  def describeStreamProcessorSource(
      describeStreamProcessorRequest: DescribeStreamProcessorRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeStreamProcessorResponse, NotUsed] =
    Source.single(describeStreamProcessorRequest).via(describeStreamProcessorFlow(parallelism))

  def describeStreamProcessorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeStreamProcessorRequest, DescribeStreamProcessorResponse, NotUsed] =
    Flow[DescribeStreamProcessorRequest].mapAsync(parallelism) { describeStreamProcessorRequest =>
      underlying.describeStreamProcessor(describeStreamProcessorRequest)
    }

  def detectCustomLabelsSource(
      detectCustomLabelsRequest: DetectCustomLabelsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DetectCustomLabelsResponse, NotUsed] =
    Source.single(detectCustomLabelsRequest).via(detectCustomLabelsFlow(parallelism))

  def detectCustomLabelsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DetectCustomLabelsRequest, DetectCustomLabelsResponse, NotUsed] =
    Flow[DetectCustomLabelsRequest].mapAsync(parallelism) { detectCustomLabelsRequest =>
      underlying.detectCustomLabels(detectCustomLabelsRequest)
    }

  def detectFacesSource(
      detectFacesRequest: DetectFacesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DetectFacesResponse, NotUsed] =
    Source.single(detectFacesRequest).via(detectFacesFlow(parallelism))

  def detectFacesFlow(parallelism: Int = DefaultParallelism): Flow[DetectFacesRequest, DetectFacesResponse, NotUsed] =
    Flow[DetectFacesRequest].mapAsync(parallelism) { detectFacesRequest =>
      underlying.detectFaces(detectFacesRequest)
    }

  def detectLabelsSource(
      detectLabelsRequest: DetectLabelsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DetectLabelsResponse, NotUsed] =
    Source.single(detectLabelsRequest).via(detectLabelsFlow(parallelism))

  def detectLabelsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DetectLabelsRequest, DetectLabelsResponse, NotUsed] =
    Flow[DetectLabelsRequest].mapAsync(parallelism) { detectLabelsRequest =>
      underlying.detectLabels(detectLabelsRequest)
    }

  def detectModerationLabelsSource(
      detectModerationLabelsRequest: DetectModerationLabelsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DetectModerationLabelsResponse, NotUsed] =
    Source.single(detectModerationLabelsRequest).via(detectModerationLabelsFlow(parallelism))

  def detectModerationLabelsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DetectModerationLabelsRequest, DetectModerationLabelsResponse, NotUsed] =
    Flow[DetectModerationLabelsRequest].mapAsync(parallelism) { detectModerationLabelsRequest =>
      underlying.detectModerationLabels(detectModerationLabelsRequest)
    }

  def detectTextSource(
      detectTextRequest: DetectTextRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DetectTextResponse, NotUsed] =
    Source.single(detectTextRequest).via(detectTextFlow(parallelism))

  def detectTextFlow(parallelism: Int = DefaultParallelism): Flow[DetectTextRequest, DetectTextResponse, NotUsed] =
    Flow[DetectTextRequest].mapAsync(parallelism) { detectTextRequest =>
      underlying.detectText(detectTextRequest)
    }

  def getCelebrityInfoSource(
      getCelebrityInfoRequest: GetCelebrityInfoRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetCelebrityInfoResponse, NotUsed] =
    Source.single(getCelebrityInfoRequest).via(getCelebrityInfoFlow(parallelism))

  def getCelebrityInfoFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetCelebrityInfoRequest, GetCelebrityInfoResponse, NotUsed] =
    Flow[GetCelebrityInfoRequest].mapAsync(parallelism) { getCelebrityInfoRequest =>
      underlying.getCelebrityInfo(getCelebrityInfoRequest)
    }

  def getCelebrityRecognitionSource(
      getCelebrityRecognitionRequest: GetCelebrityRecognitionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetCelebrityRecognitionResponse, NotUsed] =
    Source.single(getCelebrityRecognitionRequest).via(getCelebrityRecognitionFlow(parallelism))

  def getCelebrityRecognitionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetCelebrityRecognitionRequest, GetCelebrityRecognitionResponse, NotUsed] =
    Flow[GetCelebrityRecognitionRequest].mapAsync(parallelism) { getCelebrityRecognitionRequest =>
      underlying.getCelebrityRecognition(getCelebrityRecognitionRequest)
    }

  def getCelebrityRecognitionPaginatorFlow
      : Flow[GetCelebrityRecognitionRequest, GetCelebrityRecognitionResponse, NotUsed] =
    Flow[GetCelebrityRecognitionRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.getCelebrityRecognitionPaginator(request))
    }

  def getContentModerationSource(
      getContentModerationRequest: GetContentModerationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetContentModerationResponse, NotUsed] =
    Source.single(getContentModerationRequest).via(getContentModerationFlow(parallelism))

  def getContentModerationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetContentModerationRequest, GetContentModerationResponse, NotUsed] =
    Flow[GetContentModerationRequest].mapAsync(parallelism) { getContentModerationRequest =>
      underlying.getContentModeration(getContentModerationRequest)
    }

  def getContentModerationPaginatorFlow: Flow[GetContentModerationRequest, GetContentModerationResponse, NotUsed] =
    Flow[GetContentModerationRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.getContentModerationPaginator(request))
    }

  def getFaceDetectionSource(
      getFaceDetectionRequest: GetFaceDetectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetFaceDetectionResponse, NotUsed] =
    Source.single(getFaceDetectionRequest).via(getFaceDetectionFlow(parallelism))

  def getFaceDetectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetFaceDetectionRequest, GetFaceDetectionResponse, NotUsed] =
    Flow[GetFaceDetectionRequest].mapAsync(parallelism) { getFaceDetectionRequest =>
      underlying.getFaceDetection(getFaceDetectionRequest)
    }

  def getFaceDetectionPaginatorFlow: Flow[GetFaceDetectionRequest, GetFaceDetectionResponse, NotUsed] =
    Flow[GetFaceDetectionRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.getFaceDetectionPaginator(request))
    }

  def getFaceSearchSource(
      getFaceSearchRequest: GetFaceSearchRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetFaceSearchResponse, NotUsed] =
    Source.single(getFaceSearchRequest).via(getFaceSearchFlow(parallelism))

  def getFaceSearchFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetFaceSearchRequest, GetFaceSearchResponse, NotUsed] =
    Flow[GetFaceSearchRequest].mapAsync(parallelism) { getFaceSearchRequest =>
      underlying.getFaceSearch(getFaceSearchRequest)
    }

  def getFaceSearchPaginatorFlow: Flow[GetFaceSearchRequest, GetFaceSearchResponse, NotUsed] =
    Flow[GetFaceSearchRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.getFaceSearchPaginator(request))
    }

  def getLabelDetectionSource(
      getLabelDetectionRequest: GetLabelDetectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetLabelDetectionResponse, NotUsed] =
    Source.single(getLabelDetectionRequest).via(getLabelDetectionFlow(parallelism))

  def getLabelDetectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetLabelDetectionRequest, GetLabelDetectionResponse, NotUsed] =
    Flow[GetLabelDetectionRequest].mapAsync(parallelism) { getLabelDetectionRequest =>
      underlying.getLabelDetection(getLabelDetectionRequest)
    }

  def getLabelDetectionPaginatorFlow: Flow[GetLabelDetectionRequest, GetLabelDetectionResponse, NotUsed] =
    Flow[GetLabelDetectionRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.getLabelDetectionPaginator(request))
    }

  def getPersonTrackingSource(
      getPersonTrackingRequest: GetPersonTrackingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetPersonTrackingResponse, NotUsed] =
    Source.single(getPersonTrackingRequest).via(getPersonTrackingFlow(parallelism))

  def getPersonTrackingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetPersonTrackingRequest, GetPersonTrackingResponse, NotUsed] =
    Flow[GetPersonTrackingRequest].mapAsync(parallelism) { getPersonTrackingRequest =>
      underlying.getPersonTracking(getPersonTrackingRequest)
    }

  def getPersonTrackingPaginatorFlow: Flow[GetPersonTrackingRequest, GetPersonTrackingResponse, NotUsed] =
    Flow[GetPersonTrackingRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.getPersonTrackingPaginator(request))
    }

  def getTextDetectionSource(
      getTextDetectionRequest: GetTextDetectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetTextDetectionResponse, NotUsed] =
    Source.single(getTextDetectionRequest).via(getTextDetectionFlow(parallelism))

  def getTextDetectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetTextDetectionRequest, GetTextDetectionResponse, NotUsed] =
    Flow[GetTextDetectionRequest].mapAsync(parallelism) { getTextDetectionRequest =>
      underlying.getTextDetection(getTextDetectionRequest)
    }

  def getTextDetectionPaginatorFlow: Flow[GetTextDetectionRequest, GetTextDetectionResponse, NotUsed] =
    Flow[GetTextDetectionRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.getTextDetectionPaginator(request))
    }

  def indexFacesSource(
      indexFacesRequest: IndexFacesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[IndexFacesResponse, NotUsed] =
    Source.single(indexFacesRequest).via(indexFacesFlow(parallelism))

  def indexFacesFlow(parallelism: Int = DefaultParallelism): Flow[IndexFacesRequest, IndexFacesResponse, NotUsed] =
    Flow[IndexFacesRequest].mapAsync(parallelism) { indexFacesRequest =>
      underlying.indexFaces(indexFacesRequest)
    }

  def listCollectionsSource(
      listCollectionsRequest: ListCollectionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListCollectionsResponse, NotUsed] =
    Source.single(listCollectionsRequest).via(listCollectionsFlow(parallelism))

  def listCollectionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListCollectionsRequest, ListCollectionsResponse, NotUsed] =
    Flow[ListCollectionsRequest].mapAsync(parallelism) { listCollectionsRequest =>
      underlying.listCollections(listCollectionsRequest)
    }

  def listCollectionsSource(): Source[ListCollectionsResponse, NotUsed] =
    Source.fromFuture(underlying.listCollections())

  def listCollectionsPaginatorSource: Source[ListCollectionsResponse, NotUsed] =
    Source.fromPublisher(underlying.listCollectionsPaginator())

  def listCollectionsPaginatorFlow: Flow[ListCollectionsRequest, ListCollectionsResponse, NotUsed] =
    Flow[ListCollectionsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listCollectionsPaginator(request))
    }

  def listFacesSource(
      listFacesRequest: ListFacesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListFacesResponse, NotUsed] =
    Source.single(listFacesRequest).via(listFacesFlow(parallelism))

  def listFacesFlow(parallelism: Int = DefaultParallelism): Flow[ListFacesRequest, ListFacesResponse, NotUsed] =
    Flow[ListFacesRequest].mapAsync(parallelism) { listFacesRequest =>
      underlying.listFaces(listFacesRequest)
    }

  def listFacesPaginatorFlow: Flow[ListFacesRequest, ListFacesResponse, NotUsed] =
    Flow[ListFacesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listFacesPaginator(request))
    }

  def listStreamProcessorsSource(
      listStreamProcessorsRequest: ListStreamProcessorsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListStreamProcessorsResponse, NotUsed] =
    Source.single(listStreamProcessorsRequest).via(listStreamProcessorsFlow(parallelism))

  def listStreamProcessorsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListStreamProcessorsRequest, ListStreamProcessorsResponse, NotUsed] =
    Flow[ListStreamProcessorsRequest].mapAsync(parallelism) { listStreamProcessorsRequest =>
      underlying.listStreamProcessors(listStreamProcessorsRequest)
    }

  def listStreamProcessorsSource(): Source[ListStreamProcessorsResponse, NotUsed] =
    Source.fromFuture(underlying.listStreamProcessors())

  def listStreamProcessorsPaginatorSource: Source[ListStreamProcessorsResponse, NotUsed] =
    Source.fromPublisher(underlying.listStreamProcessorsPaginator())

  def listStreamProcessorsPaginatorFlow: Flow[ListStreamProcessorsRequest, ListStreamProcessorsResponse, NotUsed] =
    Flow[ListStreamProcessorsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listStreamProcessorsPaginator(request))
    }

  def recognizeCelebritiesSource(
      recognizeCelebritiesRequest: RecognizeCelebritiesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RecognizeCelebritiesResponse, NotUsed] =
    Source.single(recognizeCelebritiesRequest).via(recognizeCelebritiesFlow(parallelism))

  def recognizeCelebritiesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RecognizeCelebritiesRequest, RecognizeCelebritiesResponse, NotUsed] =
    Flow[RecognizeCelebritiesRequest].mapAsync(parallelism) { recognizeCelebritiesRequest =>
      underlying.recognizeCelebrities(recognizeCelebritiesRequest)
    }

  def searchFacesSource(
      searchFacesRequest: SearchFacesRequest,
      parallelism: Int = DefaultParallelism
  ): Source[SearchFacesResponse, NotUsed] =
    Source.single(searchFacesRequest).via(searchFacesFlow(parallelism))

  def searchFacesFlow(parallelism: Int = DefaultParallelism): Flow[SearchFacesRequest, SearchFacesResponse, NotUsed] =
    Flow[SearchFacesRequest].mapAsync(parallelism) { searchFacesRequest =>
      underlying.searchFaces(searchFacesRequest)
    }

  def searchFacesByImageSource(
      searchFacesByImageRequest: SearchFacesByImageRequest,
      parallelism: Int = DefaultParallelism
  ): Source[SearchFacesByImageResponse, NotUsed] =
    Source.single(searchFacesByImageRequest).via(searchFacesByImageFlow(parallelism))

  def searchFacesByImageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SearchFacesByImageRequest, SearchFacesByImageResponse, NotUsed] =
    Flow[SearchFacesByImageRequest].mapAsync(parallelism) { searchFacesByImageRequest =>
      underlying.searchFacesByImage(searchFacesByImageRequest)
    }

  def startCelebrityRecognitionSource(
      startCelebrityRecognitionRequest: StartCelebrityRecognitionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartCelebrityRecognitionResponse, NotUsed] =
    Source.single(startCelebrityRecognitionRequest).via(startCelebrityRecognitionFlow(parallelism))

  def startCelebrityRecognitionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartCelebrityRecognitionRequest, StartCelebrityRecognitionResponse, NotUsed] =
    Flow[StartCelebrityRecognitionRequest].mapAsync(parallelism) { startCelebrityRecognitionRequest =>
      underlying.startCelebrityRecognition(startCelebrityRecognitionRequest)
    }

  def startContentModerationSource(
      startContentModerationRequest: StartContentModerationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartContentModerationResponse, NotUsed] =
    Source.single(startContentModerationRequest).via(startContentModerationFlow(parallelism))

  def startContentModerationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartContentModerationRequest, StartContentModerationResponse, NotUsed] =
    Flow[StartContentModerationRequest].mapAsync(parallelism) { startContentModerationRequest =>
      underlying.startContentModeration(startContentModerationRequest)
    }

  def startFaceDetectionSource(
      startFaceDetectionRequest: StartFaceDetectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartFaceDetectionResponse, NotUsed] =
    Source.single(startFaceDetectionRequest).via(startFaceDetectionFlow(parallelism))

  def startFaceDetectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartFaceDetectionRequest, StartFaceDetectionResponse, NotUsed] =
    Flow[StartFaceDetectionRequest].mapAsync(parallelism) { startFaceDetectionRequest =>
      underlying.startFaceDetection(startFaceDetectionRequest)
    }

  def startFaceSearchSource(
      startFaceSearchRequest: StartFaceSearchRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartFaceSearchResponse, NotUsed] =
    Source.single(startFaceSearchRequest).via(startFaceSearchFlow(parallelism))

  def startFaceSearchFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartFaceSearchRequest, StartFaceSearchResponse, NotUsed] =
    Flow[StartFaceSearchRequest].mapAsync(parallelism) { startFaceSearchRequest =>
      underlying.startFaceSearch(startFaceSearchRequest)
    }

  def startLabelDetectionSource(
      startLabelDetectionRequest: StartLabelDetectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartLabelDetectionResponse, NotUsed] =
    Source.single(startLabelDetectionRequest).via(startLabelDetectionFlow(parallelism))

  def startLabelDetectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartLabelDetectionRequest, StartLabelDetectionResponse, NotUsed] =
    Flow[StartLabelDetectionRequest].mapAsync(parallelism) { startLabelDetectionRequest =>
      underlying.startLabelDetection(startLabelDetectionRequest)
    }

  def startPersonTrackingSource(
      startPersonTrackingRequest: StartPersonTrackingRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartPersonTrackingResponse, NotUsed] =
    Source.single(startPersonTrackingRequest).via(startPersonTrackingFlow(parallelism))

  def startPersonTrackingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartPersonTrackingRequest, StartPersonTrackingResponse, NotUsed] =
    Flow[StartPersonTrackingRequest].mapAsync(parallelism) { startPersonTrackingRequest =>
      underlying.startPersonTracking(startPersonTrackingRequest)
    }

  def startProjectVersionSource(
      startProjectVersionRequest: StartProjectVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartProjectVersionResponse, NotUsed] =
    Source.single(startProjectVersionRequest).via(startProjectVersionFlow(parallelism))

  def startProjectVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartProjectVersionRequest, StartProjectVersionResponse, NotUsed] =
    Flow[StartProjectVersionRequest].mapAsync(parallelism) { startProjectVersionRequest =>
      underlying.startProjectVersion(startProjectVersionRequest)
    }

  def startStreamProcessorSource(
      startStreamProcessorRequest: StartStreamProcessorRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartStreamProcessorResponse, NotUsed] =
    Source.single(startStreamProcessorRequest).via(startStreamProcessorFlow(parallelism))

  def startStreamProcessorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartStreamProcessorRequest, StartStreamProcessorResponse, NotUsed] =
    Flow[StartStreamProcessorRequest].mapAsync(parallelism) { startStreamProcessorRequest =>
      underlying.startStreamProcessor(startStreamProcessorRequest)
    }

  def startTextDetectionSource(
      startTextDetectionRequest: StartTextDetectionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StartTextDetectionResponse, NotUsed] =
    Source.single(startTextDetectionRequest).via(startTextDetectionFlow(parallelism))

  def startTextDetectionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StartTextDetectionRequest, StartTextDetectionResponse, NotUsed] =
    Flow[StartTextDetectionRequest].mapAsync(parallelism) { startTextDetectionRequest =>
      underlying.startTextDetection(startTextDetectionRequest)
    }

  def stopProjectVersionSource(
      stopProjectVersionRequest: StopProjectVersionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StopProjectVersionResponse, NotUsed] =
    Source.single(stopProjectVersionRequest).via(stopProjectVersionFlow(parallelism))

  def stopProjectVersionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StopProjectVersionRequest, StopProjectVersionResponse, NotUsed] =
    Flow[StopProjectVersionRequest].mapAsync(parallelism) { stopProjectVersionRequest =>
      underlying.stopProjectVersion(stopProjectVersionRequest)
    }

  def stopStreamProcessorSource(
      stopStreamProcessorRequest: StopStreamProcessorRequest,
      parallelism: Int = DefaultParallelism
  ): Source[StopStreamProcessorResponse, NotUsed] =
    Source.single(stopStreamProcessorRequest).via(stopStreamProcessorFlow(parallelism))

  def stopStreamProcessorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[StopStreamProcessorRequest, StopStreamProcessorResponse, NotUsed] =
    Flow[StopStreamProcessorRequest].mapAsync(parallelism) { stopStreamProcessorRequest =>
      underlying.stopStreamProcessor(stopStreamProcessorRequest)
    }

}
