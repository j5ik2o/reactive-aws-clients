// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch

import software.amazon.awssdk.services.batch.model._

trait BatchClient[M[_]] {

  def cancelJob(cancelJobRequest: CancelJobRequest): M[CancelJobResponse]

  def createComputeEnvironment(
      createComputeEnvironmentRequest: CreateComputeEnvironmentRequest
  ): M[CreateComputeEnvironmentResponse]

  def createJobQueue(createJobQueueRequest: CreateJobQueueRequest): M[CreateJobQueueResponse]

  def deleteComputeEnvironment(
      deleteComputeEnvironmentRequest: DeleteComputeEnvironmentRequest
  ): M[DeleteComputeEnvironmentResponse]

  def deleteJobQueue(deleteJobQueueRequest: DeleteJobQueueRequest): M[DeleteJobQueueResponse]

  def deregisterJobDefinition(
      deregisterJobDefinitionRequest: DeregisterJobDefinitionRequest
  ): M[DeregisterJobDefinitionResponse]

  def describeComputeEnvironments(
      describeComputeEnvironmentsRequest: DescribeComputeEnvironmentsRequest
  ): M[DescribeComputeEnvironmentsResponse]

  def describeComputeEnvironments(): M[DescribeComputeEnvironmentsResponse]

  def describeJobDefinitions(
      describeJobDefinitionsRequest: DescribeJobDefinitionsRequest
  ): M[DescribeJobDefinitionsResponse]

  def describeJobDefinitions(): M[DescribeJobDefinitionsResponse]

  def describeJobQueues(describeJobQueuesRequest: DescribeJobQueuesRequest): M[DescribeJobQueuesResponse]

  def describeJobQueues(): M[DescribeJobQueuesResponse]

  def describeJobs(describeJobsRequest: DescribeJobsRequest): M[DescribeJobsResponse]

  def listJobs(listJobsRequest: ListJobsRequest): M[ListJobsResponse]

  def registerJobDefinition(
      registerJobDefinitionRequest: RegisterJobDefinitionRequest
  ): M[RegisterJobDefinitionResponse]

  def submitJob(submitJobRequest: SubmitJobRequest): M[SubmitJobResponse]

  def terminateJob(terminateJobRequest: TerminateJobRequest): M[TerminateJobResponse]

  def updateComputeEnvironment(
      updateComputeEnvironmentRequest: UpdateComputeEnvironmentRequest
  ): M[UpdateComputeEnvironmentResponse]

  def updateJobQueue(updateJobQueueRequest: UpdateJobQueueRequest): M[UpdateJobQueueResponse]

}
