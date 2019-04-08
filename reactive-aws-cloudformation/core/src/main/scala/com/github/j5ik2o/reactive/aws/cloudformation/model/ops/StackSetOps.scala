// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetBuilderOps(val self: StackSet.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  } // String

  final def stackSetIdAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.stackSetId(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def statusAsScala(value: Option[StackSetStatus]): StackSet.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // String

  final def templateBodyAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  } // String

  final def parametersAsScala(value: Option[Seq[Parameter]]): StackSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Seq[Parameter]
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): StackSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    } // Seq[String]
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): StackSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

  final def stackSetARNAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.stackSetARN(v)
    }
  } // String

  final def administrationRoleARNAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.administrationRoleARN(v)
    }
  } // String

  final def executionRoleNameAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.executionRoleName(v)
    }
  } // String

}

final class StackSetOps(val self: StackSet) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) // String

  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def statusAsScala: Option[StackSetStatus] = Option(self.status) // String

  final def templateBodyAsScala: Option[String] = Option(self.templateBody) // String

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Parameter]

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

  final def stackSetARNAsScala: Option[String] = Option(self.stackSetARN) // String

  final def administrationRoleARNAsScala: Option[String] = Option(self.administrationRoleARN) // String

  final def executionRoleNameAsScala: Option[String] = Option(self.executionRoleName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetOps {

  implicit def toStackSetBuilderOps(v: StackSet.Builder): StackSetBuilderOps = new StackSetBuilderOps(v)

  implicit def toStackSetOps(v: StackSet): StackSetOps = new StackSetOps(v)

}
