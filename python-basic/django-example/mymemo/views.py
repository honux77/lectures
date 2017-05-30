from django.shortcuts import render
from django.views.generic.edit import CreateView
from django.core.urlresolvers import reverse_lazy

from .models import memo


# Create your views here.
def hello(request):
    me = {'name':'코드스쿼드', 'age': random.randint(20,80)}
    return render(request,'mymemo/hello.html', {'data': me})

def index(request):
    objects = memo.objects.all().order_by('-published_date')
    return render(request, 'mymemo/index.html',
    {'memos': objects})


class Post(CreateView):
    model = memo
    fields = ['name', 'text']
    success_url = reverse_lazy('memo')
