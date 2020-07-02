// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ListJobsResponseBuilderOps(val self: ListJobsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobSummaryListAsScala(value: Option[Seq[JobSummary]]): ListJobsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.jobSummaryList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListJobsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListJobsResponseOps(val self: ListJobsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobSummaryListAsScala: Option[Seq[JobSummary]] =
    Option(self.jobSummaryList).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListJobsResponseOps {

  implicit def toListJobsResponseBuilderOps(v: ListJobsResponse.Builder): ListJobsResponseBuilderOps =
    new ListJobsResponseBuilderOps(v)

  implicit def toListJobsResponseOps(v: ListJobsResponse): ListJobsResponseOps = new ListJobsResponseOps(v)

}
