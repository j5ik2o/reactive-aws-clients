// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class RestoreRequestBuilderOps(val self: RestoreRequest.Builder) extends AnyVal {

  final def daysAsScala(value: Option[Int]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.days(v)
    }
  } // Int

  final def glacierJobParametersAsScala(value: Option[GlacierJobParameters]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.glacierJobParameters(v)
    }
  } // GlacierJobParameters

  final def typeAsScala(value: Option[RestoreRequestType]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // RestoreRequestType

  final def tierAsScala(value: Option[Tier]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.tier(v)
    }
  } // Tier

  final def descriptionAsScala(value: Option[String]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def selectParametersAsScala(value: Option[SelectParameters]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.selectParameters(v)
    }
  } // SelectParameters

  final def outputLocationAsScala(value: Option[OutputLocation]): RestoreRequest.Builder = {
    value.fold(self) { v =>
      self.outputLocation(v)
    }
  } // OutputLocation

}

final class RestoreRequestOps(val self: RestoreRequest) extends AnyVal {

  final def daysAsScala: Option[Int] = Option(self.days) // Int

  final def glacierJobParametersAsScala: Option[GlacierJobParameters] =
    Option(self.glacierJobParameters) // GlacierJobParameters

  final def typeAsScala: Option[RestoreRequestType] = Option(self.`type`) // RestoreRequestType

  final def tierAsScala: Option[Tier] = Option(self.tier) // Tier

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def selectParametersAsScala: Option[SelectParameters] = Option(self.selectParameters) // SelectParameters

  final def outputLocationAsScala: Option[OutputLocation] = Option(self.outputLocation) // OutputLocation

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreRequestOps {

  implicit def toRestoreRequestBuilderOps(v: RestoreRequest.Builder): RestoreRequestBuilderOps =
    new RestoreRequestBuilderOps(v)

  implicit def toRestoreRequestOps(v: RestoreRequest): RestoreRequestOps = new RestoreRequestOps(v)

}
