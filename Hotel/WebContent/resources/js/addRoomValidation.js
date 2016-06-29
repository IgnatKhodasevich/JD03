function showError(container, errorMessage) {
	
      container.className = 'error';
      var msgElem = document.createElement('span');
      msgElem.className = "error-message";
      msgElem.innerHTML = errorMessage;
      container.appendChild(msgElem);
    }

    function resetError(container) {
      container.className = '';
      if (container.lastChild.className == "error-message") {
        container.removeChild(container.lastChild);
      }
    }

    function validate(form) {
      var elems = form.elements;

      resetError(elems.number.parentNode);
      if (!elems.number.value) {
        showError(elems.number.parentNode, ' Specify number of room.');
      }

      resetError(elems.price_per_day.parentNode);
      if (!elems.price_per_day.value) {
        showError(elems.price_per_day.parentNode, ' Specify price.');
      } 

      

    }