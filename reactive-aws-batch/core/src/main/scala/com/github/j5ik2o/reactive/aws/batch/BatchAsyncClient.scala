// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch

import software.amazon.awssdk.services.batch.model._
import software.amazon.awssdk.services.batch.{ BatchAsyncClient => JavaBatchAsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object BatchAsyncClient {

  def apply(javaClient: JavaBatchAsyncClient): BatchAsyncClient =
    new BatchAsyncClient {
      override val underlying: JavaBatchAsyncClient = javaClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/batch/BatchAsyncClient.html
  */
trait BatchAsyncClient extends BatchClient[Future] {
  val underlying: JavaBatchAsyncClient

  override def cancelJob(cancelJobRequest: CancelJobRequest): Future[CancelJobResponse] =
    underlying.cancelJob(cancelJobRequest).toScala

  override def createComputeEnvironment(
      createComputeEnvironmentRequest: CreateComputeEnvironmentRequest
  ): Future[CreateComputeEnvironmentResponse] =
    underlying.createComputeEnvironment(createComputeEnvironmentRequest).toScala

  override def createJobQueue(createJobQueueRequest: CreateJobQueueRequest): Future[CreateJobQueueResponse] =
    underlying.createJobQueue(createJobQueueRequest).toScala

  override def deleteComputeEnvironment(
      deleteComputeEnvironmentRequest: DeleteComputeEnvironmentRequest
  ): Future[DeleteComputeEnvironmentResponse] =
    underlying.deleteComputeEnvironment(deleteComputeEnvironmentRequest).toScala

  override def deleteJobQueue(deleteJobQueueRequest: DeleteJobQueueRequest): Future[DeleteJobQueueResponse] =
    underlying.deleteJobQueue(deleteJobQueueRequest).toScala

  override def deregisterJobDefinition(
      deregisterJobDefinitionRequest: DeregisterJobDefinitionRequest
  ): Future[DeregisterJobDefinitionResponse] =
    underlying.deregisterJobDefinition(deregisterJobDefinitionRequest).toScala

  override def describeComputeEnvironments(
      describeComputeEnvironmentsRequest: DescribeComputeEnvironmentsRequest
  ): Future[DescribeComputeEnvironmentsResponse] =
    underlying.describeComputeEnvironments(describeComputeEnvironmentsRequest).toScala

  override def describeComputeEnvironments(): Future[DescribeComputeEnvironmentsResponse] =
    underlying.describeComputeEnvironments().toScala

  override def describeJobDefinitions(
      describeJobDefinitionsRequest: DescribeJobDefinitionsRequest
  ): Future[DescribeJobDefinitionsResponse] =
    underlying.describeJobDefinitions(describeJobDefinitionsRequest).toScala

  override def describeJobDefinitions(): Future[DescribeJobDefinitionsResponse] =
    underlying.describeJobDefinitions().toScala

  override def describeJobQueues(
      describeJobQueuesRequest: DescribeJobQueuesRequest
  ): Future[DescribeJobQueuesResponse] =
    underlying.describeJobQueues(describeJobQueuesRequest).toScala

  override def describeJobQueues(): Future[DescribeJobQueuesResponse] =
    underlying.describeJobQueues().toScala

  override def describeJobs(describeJobsRequest: DescribeJobsRequest): Future[DescribeJobsResponse] =
    underlying.describeJobs(describeJobsRequest).toScala

  override def listJobs(listJobsRequest: ListJobsRequest): Future[ListJobsResponse] =
    underlying.listJobs(listJobsRequest).toScala

  override def registerJobDefinition(
      registerJobDefinitionRequest: RegisterJobDefinitionRequest
  ): Future[RegisterJobDefinitionResponse] =
    underlying.registerJobDefinition(registerJobDefinitionRequest).toScala

  override def submitJob(submitJobRequest: SubmitJobRequest): Future[SubmitJobResponse] =
    underlying.submitJob(submitJobRequest).toScala

  override def terminateJob(terminateJobRequest: TerminateJobRequest): Future[TerminateJobResponse] =
    underlying.terminateJob(terminateJobRequest).toScala

  override def updateComputeEnvironment(
      updateComputeEnvironmentRequest: UpdateComputeEnvironmentRequest
  ): Future[UpdateComputeEnvironmentResponse] =
    underlying.updateComputeEnvironment(updateComputeEnvironmentRequest).toScala

  override def updateJobQueue(updateJobQueueRequest: UpdateJobQueueRequest): Future[UpdateJobQueueResponse] =
    underlying.updateJobQueue(updateJobQueueRequest).toScala

}
