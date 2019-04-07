// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeParametersResponseBuilderOps(val self: DescribeParametersResponse.Builder) extends AnyVal {

  final def withNextTokenAsScala(value: Option[String]): DescribeParametersResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

  final def withParametersAsScala(value: Option[Seq[Parameter]]): DescribeParametersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Seq[Parameter]
  }

}

final class DescribeParametersResponseOps(val self: DescribeParametersResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Parameter]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeParametersResponseOps {

  implicit def toDescribeParametersResponseBuilderOps(
      v: DescribeParametersResponse.Builder
  ): DescribeParametersResponseBuilderOps = new DescribeParametersResponseBuilderOps(v)

  implicit def toDescribeParametersResponseOps(v: DescribeParametersResponse): DescribeParametersResponseOps =
    new DescribeParametersResponseOps(v)

}
