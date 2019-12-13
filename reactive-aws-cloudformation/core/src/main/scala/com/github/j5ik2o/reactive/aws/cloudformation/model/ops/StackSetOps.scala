// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetBuilderOps(val self: StackSet.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetIdAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.stackSetId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[StackSetStatus]): StackSet.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Seq[Parameter]]): StackSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala(value: Option[Seq[Capability]]): StackSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capabilities(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): StackSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetARNAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.stackSetARN(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def administrationRoleARNAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.administrationRoleARN(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleNameAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.executionRoleName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetDriftDetectionDetailsAsScala(value: Option[StackSetDriftDetectionDetails]): StackSet.Builder = {
    value.fold(self) { v =>
      self.stackSetDriftDetectionDetails(v)
    }
  }

}

final class StackSetOps(val self: StackSet) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[StackSetStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetARNAsScala: Option[String] = Option(self.stackSetARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def administrationRoleARNAsScala: Option[String] = Option(self.administrationRoleARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleNameAsScala: Option[String] = Option(self.executionRoleName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetDriftDetectionDetailsAsScala: Option[StackSetDriftDetectionDetails] =
    Option(self.stackSetDriftDetectionDetails)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetOps {

  implicit def toStackSetBuilderOps(v: StackSet.Builder): StackSetBuilderOps = new StackSetBuilderOps(v)

  implicit def toStackSetOps(v: StackSet): StackSetOps = new StackSetOps(v)

}
