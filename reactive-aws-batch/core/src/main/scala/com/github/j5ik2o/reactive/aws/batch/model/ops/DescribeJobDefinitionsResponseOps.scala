// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeJobDefinitionsResponseBuilderOps(val self: DescribeJobDefinitionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionsAsScala(value: Option[Seq[JobDefinition]]): DescribeJobDefinitionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.jobDefinitions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeJobDefinitionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeJobDefinitionsResponseOps(val self: DescribeJobDefinitionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionsAsScala: Option[Seq[JobDefinition]] = Option(self.jobDefinitions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeJobDefinitionsResponseOps {

  implicit def toDescribeJobDefinitionsResponseBuilderOps(
      v: DescribeJobDefinitionsResponse.Builder
  ): DescribeJobDefinitionsResponseBuilderOps = new DescribeJobDefinitionsResponseBuilderOps(v)

  implicit def toDescribeJobDefinitionsResponseOps(
      v: DescribeJobDefinitionsResponse
  ): DescribeJobDefinitionsResponseOps = new DescribeJobDefinitionsResponseOps(v)

}
