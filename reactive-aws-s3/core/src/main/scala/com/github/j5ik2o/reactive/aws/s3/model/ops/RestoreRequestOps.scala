// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class RestoreRequestBuilderOps(val self: RestoreRequest.Builder) extends AnyVal {

  final def daysAsScala(value: Option[Int]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.days(v)
    }
  }

  final def glacierJobParametersAsScala(value: Option[GlacierJobParameters]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.glacierJobParameters(v)
    }
  }

  final def typeAsScala(value: Option[RestoreRequestType]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def tierAsScala(value: Option[Tier]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def selectParametersAsScala(value: Option[SelectParameters]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.selectParameters(v)
    }
  }

  final def outputLocationAsScala(value: Option[OutputLocation]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.outputLocation(v)
    }
  }

}

final class RestoreRequestOps(val self: RestoreRequest) extends AnyVal {

  final def daysAsScala: Option[Int] = Option(self.days)

  final def glacierJobParametersAsScala: Option[GlacierJobParameters] = Option(self.glacierJobParameters)

  final def typeAsScala: Option[RestoreRequestType] = Option(self.`type`)

  final def tierAsScala: Option[Tier] = Option(self.tier)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def selectParametersAsScala: Option[SelectParameters] = Option(self.selectParameters)

  final def outputLocationAsScala: Option[OutputLocation] = Option(self.outputLocation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreRequestOps {

  implicit def toRestoreRequestBuilderOps(v: RestoreRequest.Builder): RestoreRequestBuilderOps =
    new RestoreRequestBuilderOps(v)

  implicit def toRestoreRequestOps(v: RestoreRequest): RestoreRequestOps = new RestoreRequestOps(v)

}
