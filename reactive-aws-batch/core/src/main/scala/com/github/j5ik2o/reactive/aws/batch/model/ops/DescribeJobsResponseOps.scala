// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeJobsResponseBuilderOps(val self: DescribeJobsResponse.Builder) extends AnyVal {

  final def jobsAsScala(value: Option[Seq[JobDetail]]): DescribeJobsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.jobs(v.asJava)
    }
  }

}

final class DescribeJobsResponseOps(val self: DescribeJobsResponse) extends AnyVal {

  final def jobsAsScala: Option[Seq[JobDetail]] = Option(self.jobs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeJobsResponseOps {

  implicit def toDescribeJobsResponseBuilderOps(v: DescribeJobsResponse.Builder): DescribeJobsResponseBuilderOps =
    new DescribeJobsResponseBuilderOps(v)

  implicit def toDescribeJobsResponseOps(v: DescribeJobsResponse): DescribeJobsResponseOps =
    new DescribeJobsResponseOps(v)

}
