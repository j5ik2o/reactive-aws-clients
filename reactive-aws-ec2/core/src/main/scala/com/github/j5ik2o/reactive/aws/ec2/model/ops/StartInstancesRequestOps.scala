// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StartInstancesRequestBuilderOps(val self: StartInstancesRequest.Builder) extends AnyVal {

  final def instanceIdsAsScala(value: Option[Seq[String]]): StartInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceIds(v.asJava)
    }
  }

  final def additionalInfoAsScala(value: Option[String]): StartInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.additionalInfo(v)
    }
  }

}

final class StartInstancesRequestOps(val self: StartInstancesRequest) extends AnyVal {

  final def instanceIdsAsScala: Option[Seq[String]] = Option(self.instanceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def additionalInfoAsScala: Option[String] = Option(self.additionalInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartInstancesRequestOps {

  implicit def toStartInstancesRequestBuilderOps(v: StartInstancesRequest.Builder): StartInstancesRequestBuilderOps =
    new StartInstancesRequestBuilderOps(v)

  implicit def toStartInstancesRequestOps(v: StartInstancesRequest): StartInstancesRequestOps =
    new StartInstancesRequestOps(v)

}
