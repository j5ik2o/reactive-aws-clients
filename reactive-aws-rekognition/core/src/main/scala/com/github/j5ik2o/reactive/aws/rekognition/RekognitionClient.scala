// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition

import software.amazon.awssdk.services.rekognition.model._

trait RekognitionClient[M[_]] {

  def compareFaces(compareFacesRequest: CompareFacesRequest): M[CompareFacesResponse]

  def createCollection(createCollectionRequest: CreateCollectionRequest): M[CreateCollectionResponse]

  def createProject(createProjectRequest: CreateProjectRequest): M[CreateProjectResponse]

  def createProjectVersion(createProjectVersionRequest: CreateProjectVersionRequest): M[CreateProjectVersionResponse]

  def createStreamProcessor(
      createStreamProcessorRequest: CreateStreamProcessorRequest
  ): M[CreateStreamProcessorResponse]

  def deleteCollection(deleteCollectionRequest: DeleteCollectionRequest): M[DeleteCollectionResponse]

  def deleteFaces(deleteFacesRequest: DeleteFacesRequest): M[DeleteFacesResponse]

  def deleteProject(deleteProjectRequest: DeleteProjectRequest): M[DeleteProjectResponse]

  def deleteProjectVersion(deleteProjectVersionRequest: DeleteProjectVersionRequest): M[DeleteProjectVersionResponse]

  def deleteStreamProcessor(
      deleteStreamProcessorRequest: DeleteStreamProcessorRequest
  ): M[DeleteStreamProcessorResponse]

  def describeCollection(describeCollectionRequest: DescribeCollectionRequest): M[DescribeCollectionResponse]

  def describeProjectVersions(
      describeProjectVersionsRequest: DescribeProjectVersionsRequest
  ): M[DescribeProjectVersionsResponse]

  def describeProjects(describeProjectsRequest: DescribeProjectsRequest): M[DescribeProjectsResponse]

  def describeStreamProcessor(
      describeStreamProcessorRequest: DescribeStreamProcessorRequest
  ): M[DescribeStreamProcessorResponse]

  def detectCustomLabels(detectCustomLabelsRequest: DetectCustomLabelsRequest): M[DetectCustomLabelsResponse]

  def detectFaces(detectFacesRequest: DetectFacesRequest): M[DetectFacesResponse]

  def detectLabels(detectLabelsRequest: DetectLabelsRequest): M[DetectLabelsResponse]

  def detectModerationLabels(
      detectModerationLabelsRequest: DetectModerationLabelsRequest
  ): M[DetectModerationLabelsResponse]

  def detectText(detectTextRequest: DetectTextRequest): M[DetectTextResponse]

  def getCelebrityInfo(getCelebrityInfoRequest: GetCelebrityInfoRequest): M[GetCelebrityInfoResponse]

  def getCelebrityRecognition(
      getCelebrityRecognitionRequest: GetCelebrityRecognitionRequest
  ): M[GetCelebrityRecognitionResponse]

  def getContentModeration(getContentModerationRequest: GetContentModerationRequest): M[GetContentModerationResponse]

  def getFaceDetection(getFaceDetectionRequest: GetFaceDetectionRequest): M[GetFaceDetectionResponse]

  def getFaceSearch(getFaceSearchRequest: GetFaceSearchRequest): M[GetFaceSearchResponse]

  def getLabelDetection(getLabelDetectionRequest: GetLabelDetectionRequest): M[GetLabelDetectionResponse]

  def getPersonTracking(getPersonTrackingRequest: GetPersonTrackingRequest): M[GetPersonTrackingResponse]

  def getSegmentDetection(getSegmentDetectionRequest: GetSegmentDetectionRequest): M[GetSegmentDetectionResponse]

  def getTextDetection(getTextDetectionRequest: GetTextDetectionRequest): M[GetTextDetectionResponse]

  def indexFaces(indexFacesRequest: IndexFacesRequest): M[IndexFacesResponse]

  def listCollections(listCollectionsRequest: ListCollectionsRequest): M[ListCollectionsResponse]

  def listCollections(): M[ListCollectionsResponse]

  def listFaces(listFacesRequest: ListFacesRequest): M[ListFacesResponse]

  def listStreamProcessors(listStreamProcessorsRequest: ListStreamProcessorsRequest): M[ListStreamProcessorsResponse]

  def listStreamProcessors(): M[ListStreamProcessorsResponse]

  def recognizeCelebrities(recognizeCelebritiesRequest: RecognizeCelebritiesRequest): M[RecognizeCelebritiesResponse]

  def searchFaces(searchFacesRequest: SearchFacesRequest): M[SearchFacesResponse]

  def searchFacesByImage(searchFacesByImageRequest: SearchFacesByImageRequest): M[SearchFacesByImageResponse]

  def startCelebrityRecognition(
      startCelebrityRecognitionRequest: StartCelebrityRecognitionRequest
  ): M[StartCelebrityRecognitionResponse]

  def startContentModeration(
      startContentModerationRequest: StartContentModerationRequest
  ): M[StartContentModerationResponse]

  def startFaceDetection(startFaceDetectionRequest: StartFaceDetectionRequest): M[StartFaceDetectionResponse]

  def startFaceSearch(startFaceSearchRequest: StartFaceSearchRequest): M[StartFaceSearchResponse]

  def startLabelDetection(startLabelDetectionRequest: StartLabelDetectionRequest): M[StartLabelDetectionResponse]

  def startPersonTracking(startPersonTrackingRequest: StartPersonTrackingRequest): M[StartPersonTrackingResponse]

  def startProjectVersion(startProjectVersionRequest: StartProjectVersionRequest): M[StartProjectVersionResponse]

  def startSegmentDetection(
      startSegmentDetectionRequest: StartSegmentDetectionRequest
  ): M[StartSegmentDetectionResponse]

  def startStreamProcessor(startStreamProcessorRequest: StartStreamProcessorRequest): M[StartStreamProcessorResponse]

  def startTextDetection(startTextDetectionRequest: StartTextDetectionRequest): M[StartTextDetectionResponse]

  def stopProjectVersion(stopProjectVersionRequest: StopProjectVersionRequest): M[StopProjectVersionResponse]

  def stopStreamProcessor(stopStreamProcessorRequest: StopStreamProcessorRequest): M[StopStreamProcessorResponse]

}
