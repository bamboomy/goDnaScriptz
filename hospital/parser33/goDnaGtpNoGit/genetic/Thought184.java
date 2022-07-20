package genetic;
import java.util.ArrayList;
class Thought184 extends Thought{
private static ArrayList<Thought184> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 234.47250100612172;
private double fd1 = 12.863736730809709;
private Thought fo0 = null;
private Thought fo1 = null;
Thought184 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought184 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought184 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought184 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought184 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought184 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought184 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought184 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought184 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought184 instance = new Thought184 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought184 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought184 instance = new Thought184 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought184 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought184 instance = new Thought184 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought184 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought184 instance = new Thought184 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought184 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought184 instance = new Thought184 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought184 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought184 instance = new Thought184 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought184 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought184 instance = new Thought184 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought184 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought184 instance = new Thought184 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought296.getInstance();
    double ld1 = 850.2037632568492;
        double ld2 = 244.89818259936777;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld2, fd0, fd1, fb1, lb3, fb0, fb1);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
    ld1 = ld2 + fd0;
    lb3 = lb4 && fb0;
    fd1 *= -1;
    Thought lo5 = Thought189.getInstance(fo0, fo1, fo0, fo1);
    ld1 *= -1;
    Output.points[1][1] -= ld2;
    fb1 = !lb3;
    double ld6 = 156.98217665821724;
    Thought lo7 = Thought348.getInstance(ld6, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld6, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        for(int i1=0; i1<10; i1++){
            fd1 *= -1;
            ab1 = fd0 > fd1;
            Thought lo0 = Thought61.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
            Thought lo1 = Thought265.getInstance(fo0, fo1, fo0, fo1);
            Thought lo2 = Thought14.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
            double ld3 = 998.8321457409066;
            ab4 = fb0 || fb1;
            ld3 = fd0 - fd1;
            ab1 = ld3 < fd0;
            fd1 = ld3 + fd0;
if(fo0 != null){
              fo0.m3();
}
            Thought lo4 = Thought266.getInstance(ab2, ab3, ab4, fb0);
            fd1 = ld3 - fd0;
            fd1 = ld3 - fd0;
            fb1 = ab1 || ab2;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    Thought lo0 = Thought299.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    if (fb1) {
        fd0 *= -1;
        fd1 = ad1 - ad2;
        fb0 = ad3 < ad4;
        fb1 = fb0 && fb1;
        Thought lo1 = Thought395.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
        fb0 = ad3 > ad4;
        fd0 = fd1 - ad1;
        fb1 = ad2 < ad3;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Output.points[1][2] -= ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fd0 < fd1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
    Thought lo0 = Thought364.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    ab3 = !ab4;
    fb0 = !fb1;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1();
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Output.points[1][3] += ad2;
    ad3 = ad4 + fd0;
    lb1 = !ab1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought47.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao1 != null){
      ad4 = ao1.m3();
}
    if (fb0) {
        fd0 = fd1 - ad1;
        Thought lo2 = Thought185.getInstance(fb1, lb0, fb0, fb1);
        lb0 = fb0 && fb1;
        } else {
        ad2 = ad3 - ad4;
        if (lb0) {
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
            ad3 = ad4 + fd0;
if(ao2 != null){
              fd1 = ao2.m3(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
              fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
            Thought lo3 = Thought270.getInstance(ao2, ao3, ao4, fo0);
            fb0 = fd1 > ad1;
if(fo1 != null){
              fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
            } else {
if(ao1 != null){
              fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
            Thought lo4 = Thought306.getInstance();
            fd0 *= -1;
            lb0 = fd1 < ad1;
            fb0 = ad2 < ad3;
if(fo1 != null){
              fo1.m1(fb1, lb0, fb0, fb1);
}
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
    fd0 *= -1;
    boolean lb0 = true;
    ab1 = !ab2;
    ab3 = fd1 > fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    ab2 = fd1 < fd0;
    ab3 = fd1 > fd0;
    if (ab4) {
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        boolean lb3 = true;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, lb1, lb2, ab1, ab2);
}
        Thought lo4 = Thought107.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
        lb3 = lb0 && lb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    if (ab2) {
        ad1 = ad2 - ad3;
        ab3 = ab4 || fb0;
if(ao4 != null){
          ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        ad4 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        Thought lo0 = Thought128.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
        ad1 *= -1;
        ab3 = ab4 || fb0;
        Thought lo1 = Thought272.getInstance(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    boolean lb0 = false;
    lb0 = !fb0;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    if (lb1) {
        fb0 = fb1 && lb0;
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fb0 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb1 = !lb0;
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
        fd1 = fd0 - fd1;
        Output.points[1][4] -= fd0;
        lb1 = fb0 && fb1;
        lb0 = lb1 || fb0;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    double ld1 = 833.5835213513084;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 = ld1 + fd0;
    fd1 = ld1 + fd0;
    Output.points[1][5] += fd1;
    ld1 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
        boolean lb3 = false;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ld1 - fd0;
    fd1 = ld1 - fd0;
    Thought lo4 = Thought0.getInstance(fd1, ld1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    ab3 = ab4 || fb0;
    Output.points[1][6] -= fd0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    double ld1 = 795.8631709420489;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ld1 = fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = ad1 < ad2;
    fb0 = !fb1;
    ad3 = ad4 - fd0;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
    ld1 *= -1;
    boolean lb3 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Output.points[1][7] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ad1 > ad2;
    Thought lo0 = Thought350.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ad1 = ad2 + ad3;
    ab4 = ad4 > fd0;
    fb0 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 457.43830740827843;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            ad3 = ad4 + fd0;
            if (ab2) {
                double ld2 = 539.8419317979692;
                ab3 = ab4 || fb0;
if(fo0 != null){
                  fd0 = fo0.m3(fd1, ld2, ld1, ad1);
}
                fb1 = ab1 && ab2;
                Thought lo3 = Thought342.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}}}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
    double ld0 = 355.70716481749776;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fb0 = ld0 < fd0;
    fb1 = lb1 || fb0;
    boolean lb2 = false;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb2);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fd0 < fd1;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
    double ld4 = 657.2501713556287;
if(fo0 != null){
      ao4 = fo0.m4();
}

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ad1 *= -1;
    fb0 = !fb1;
            fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    Thought lo0 = Thought194.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 < fd1;
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    Thought lo0 = Thought70.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m1();
}
    fd1 = fd0 - fd1;
    if (ab2) {
if(fo1 != null){
          fo1.m3(ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
        fd1 *= -1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = ad2 < ad3;
    Output.points[1][8] -= ad4;
    fd0 = fd1 + ad1;
    ab2 = ad2 > ad3;
    ab3 = ad4 < fd0;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    double ld0 = 953.6634557510777;
    Thought lo1 = Thought88.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ab1 && ab2;
    double ld2 = 758.5235128047701;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      fb1 = ao1.m2(ab1, ab2, ab3, ab4);
}
    double ld3 = 484.271358163404;
    ad2 = ad3 + ad4;
    boolean lb4 = false;
    ab4 = fb0 && fb1;
    boolean lb5 = false;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return lb4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[2][0] -= fd0;
    fb0 = !fb1;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    boolean lb0 = false;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb0 = !fb0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    ab4 = fd1 > fd0;
    Thought lo1 = Thought208.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 || lb0;
    fd1 *= -1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    double ld3 = 807.2925217383918;
    ab3 = ab4 || fb0;
    fb1 = ld3 > fd0;
        lb0 = lb2 && ab1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    double ld1 = 66.23067563740948;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = !fb0;
    boolean lb2 = true;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    ad1 *= -1;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, lb2, fb0, fb1);
}
    double ld3 = 1.9366457411298892;
    ad4 *= -1;
    Thought lo4 = Thought162.getInstance(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
    lb0 = fd0 < fd1;
    Output.points[2][1] -= ld1;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought74.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ld1;
    double ld6 = 603.4519276746947;
    double ld7 = 996.5974929522013;
    lb2 = ld3 < ld6;
    fb0 = ld7 > ad1;
    fb1 = lb0 && lb2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ld1;
    double ld8 = 213.934879342475;

Thought.STACK_COUNTER++;
return ld3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought281.getInstance();
    Thought lo1 = Thought185.getInstance(ab2, ab3, ab4, fb0);
    boolean lb2 = false;
    Thought lo3 = Thought277.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    ab2 = ab3 && ab4;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, lb2, ab1, ab2);
}
        Thought lo4 = Thought180.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb2 = ab1 || ab2;
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    fb1 = lb0 || fb0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought14.getInstance();
    fb1 = lb0 || fb0;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        lb0 = fd1 > fd0;
        fb0 = fd1 < fd0;
        fb1 = lb0 || fb0;
        double ld2 = 726.4064592940898;
        boolean lb3 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, fb0, fb1, lb3, lb0);
}
        fd1 = ld2 - fd0;
        fb0 = fb1 && lb3;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld2, fd0, fd1, lb0, fb0, fb1, lb3);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb3);
}
        Thought lo4 = Thought288.getInstance(fo0, fo1, ao1, ao2);
        Output.points[2][2] -= ld2;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld2, fd0);
}
        boolean lb5 = false;
        fd1 = ld2 - fd0;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought6.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    boolean lb1 = false;
if(fo0 != null){
      ad3 = fo0.m3();
}
    double ld2 = 530.6054115167942;
    fb0 = !fb1;
    boolean lb3 = false;
    lb1 = !lb3;
    ad3 = ad4 + fd0;
    fd1 = ld2 + ad1;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m2(lb3, fb0, fb1, lb1);
}
    Thought lo4 = Thought374.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb1);
    double ld5 = 860.3374959551702;
    fd0 *= -1;
    fd1 = ld2 + ld5;
    lb3 = !fb0;
    fb1 = ad1 > ad2;
    lb1 = lb3 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1, lb1, lb3, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, lb3, fb0, fb1);
}
    lb1 = ld2 < ld5;
    ad1 *= -1;
    lb3 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
    lb1 = ad2 > ad3;
    boolean lb6 = true;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    double ld1 = 284.7830751886603;
    Thought lo2 = Thought95.getInstance();
    Thought lo3 = Thought378.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ld1 < fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, ab1, ab2);
}
            ab3 = ld1 > fd0;
        fd1 *= -1;
if(ao1 != null){
      ld1 = ao1.m3(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fb1 && lb0;
    Thought lo4 = Thought206.getInstance(ao2, ao3, ao4, fo0);
    ld1 = fd0 - fd1;
    ab1 = !ab2;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld0 = 823.9096341603943;
    ab3 = ld0 < ad1;
    Thought lo1 = Thought7.getInstance();
    boolean lb2 = true;
    ad2 = ad3 - ad4;
    ab3 = ab4 || fb0;
    fb1 = fd0 < fd1;
if(ao1 != null){
      ao1.m2(lb2, ab1, ab2, ab3);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb2);
}
    ab1 = !ab2;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought160.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    lb0 = fd1 > fd0;
    boolean lb2 = false;
    double ld3 = 521.2088260448072;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    double ld4 = 968.3995470133802;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld3);
}
    lb2 = ld4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, ld4, fd0, fd1);
}
    fb0 = fb1 && lb0;
    boolean lb5 = false;
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ld4 = fo1.m3(lb2, lb5, fb0, fb1);
}
    lb0 = fd0 > fd1;
    ld3 = ld4 - fd0;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = fd1 > fd0;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    lb2 = ab1 && ab2;
    Thought lo3 = Thought154.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
}
    boolean lb4 = false;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought390.getInstance(fd0, fd1, fd0, fd1);

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = ad1 > ad2;
    boolean lb1 = true;
    lb1 = ad3 < ad4;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = !lb0;
    lb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    Thought lo2 = Thought397.getInstance();
    boolean lb3 = false;
if(fo0 != null){
      ad4 = fo0.m3(lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, lb3, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
    fd0 = fd1 + ad1;
    boolean lb0 = true;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought135.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = ad4 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo3 = Thought8.getInstance(fb1, lb0, lb2, ab1);
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb0, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb4 = true;
    fb0 = fb1 || lb0;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    if (fb0) {
        Thought lo0 = Thought363.getInstance();
        fd1 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        Thought lo1 = Thought362.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        fb0 = !fb1;
        fb0 = fd0 < fd1;
        Output.points[2][3] += fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Thought lo2 = Thought396.getInstance(fd1, fd0, fd1, fd0);
        double ld3 = 369.6705669422592;
        fd0 = fd1 - ld3;
        fd0 = fd1 + ld3;
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Output.points[2][4] += ad1;
    fb0 = ad2 > ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao3.m1(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    if (lb0) {
if(ao3 != null){
          lb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
        } else {
        fb0 = ad4 > fd0;
        fb1 = fd1 < ad1;
        ad2 = ad3 - ad4;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
        Output.points[2][5] -= ad3;
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        lb0 = lb1 || fb0;
        fb1 = !lb0;
        ad3 *= -1;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    ab3 = !ab4;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    Output.points[2][6] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    Thought lo2 = Thought33.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought115.getInstance();
    ad1 = ad2 + ad3;
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    if (fb1) {
        double ld2 = 60.40550815388855;
        lb0 = ab1 || ab2;
        ab3 = ad3 > ad4;
        fd0 *= -1;
        boolean lb3 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, ad1, ad2, ab3, ab4, fb0, fb1);
}
        Output.points[2][7] += ad3;
        Thought lo4 = Thought102.getInstance(ad4, fd0, fd1, ld2, lb3, lb0, ab1, ab2);
        ab3 = !ab4;
        boolean lb5 = true;
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][8] += fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought370.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
          fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought291.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    double ld3 = 798.7069252138483;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
    fd0 = fd1 + ld3;
    lb2 = fb0 && fb1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld3, fd0, fd1);
}
    Output.points[3][0] -= ld3;
    boolean lb5 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 137.55254290404224;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought293.getInstance(fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    fd1 = ld0 - fd0;
    fb0 = fb1 || lb2;
    fd1 *= -1;
    Thought lo3 = Thought218.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    fd1 = ld0 + fd0;
        fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld0 = fd0 + fd1;
    boolean lb4 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 622.8593824661102;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo1 != null){
      ld0 = fo1.m3();
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb1, lb2, fb0);
}
    boolean lb3 = false;
    boolean lb4 = false;
    Output.points[3][1] += fd1;
    boolean lb5 = true;
    boolean lb6 = false;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0, lb4, lb5, lb6, fb0);
}
    fb1 = lb1 || lb2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb3, lb4, lb5, lb6);
}
    fb0 = fd1 < ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fb1 = lb1 && lb2;
    fd1 = ld0 + fd0;
    double ld7 = 241.27024331967468;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
