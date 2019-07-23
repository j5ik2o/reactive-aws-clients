// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeJobsResponseBuilderOps(val self: DescribeJobsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobsAsScala(value: Option[Seq[JobDetail]]): DescribeJobsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.jobs(v.asJava)
    }
  }

}

final class DescribeJobsResponseOps(val self: DescribeJobsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobsAsScala: Option[Seq[JobDetail]] = Option(self.jobs).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeJobsResponseOps {

  implicit def toDescribeJobsResponseBuilderOps(v: DescribeJobsResponse.Builder): DescribeJobsResponseBuilderOps =
    new DescribeJobsResponseBuilderOps(v)

  implicit def toDescribeJobsResponseOps(v: DescribeJobsResponse): DescribeJobsResponseOps =
    new DescribeJobsResponseOps(v)

}
