// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ListJobsRequestBuilderOps(val self: ListJobsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueAsScala(value: Option[String]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.jobQueue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arrayJobIdAsScala(value: Option[String]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.arrayJobId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def multiNodeJobIdAsScala(value: Option[String]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.multiNodeJobId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala(value: Option[JobStatus]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.jobStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListJobsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListJobsRequestOps(val self: ListJobsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueAsScala: Option[String] = Option(self.jobQueue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arrayJobIdAsScala: Option[String] = Option(self.arrayJobId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def multiNodeJobIdAsScala: Option[String] = Option(self.multiNodeJobId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala: Option[JobStatus] = Option(self.jobStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListJobsRequestOps {

  implicit def toListJobsRequestBuilderOps(v: ListJobsRequest.Builder): ListJobsRequestBuilderOps =
    new ListJobsRequestBuilderOps(v)

  implicit def toListJobsRequestOps(v: ListJobsRequest): ListJobsRequestOps = new ListJobsRequestOps(v)

}
